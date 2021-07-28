package com.lpg.app.product.management.service;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getIndex() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from LGP Product Management App!")));
    }

    @Test
    public void getProducts() throws Exception {
        String expected = "[{\"id\":1,\"name\":\"Knife Set\",\"description\":\"A set of knives in all shapes and sizes.\"";
        mvc.perform(MockMvcRequestBuilders.get("/api/products").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(startsWith(expected)));
    }

    @Test
    public void getProductById() throws Exception {
        String expected = "{\"id\":1,\"name\":\"Knife Set\",\"description\":\"A set of knives in all shapes and sizes.\",\"categoryId\":1,\"creationDate\":\"9/20/2020 0:01\",\"updateDate\":\"9/20/2020 0:01\",\"lastPurchasedDate\":\"10/24/2020 0:01\"}";
        mvc.perform(MockMvcRequestBuilders.get("/api/products/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(startsWith(expected)));
    }
}