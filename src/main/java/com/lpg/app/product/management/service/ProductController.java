package com.lpg.app.product.management.service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.OPTIONS, RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}, allowedHeaders = "*", allowCredentials = "true")
public class ProductController {

    private final ProductRepository productRepository;

    private final CategoryRepository categoryRepository;

    public ProductController(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from LGP Product Management App!";
    }

    @GetMapping("/api/products")
    List<Product> allProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/api/products/{id}")
    Product one(@PathVariable Long id) {

        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @GetMapping("/api/categories")
    List<Category> allCategories() {
        return categoryRepository.findAll();
    }
}
