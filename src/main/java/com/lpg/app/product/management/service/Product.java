package com.lpg.app.product.management.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Product {

    private @Id @GeneratedValue Long id;

    private String name;

    private String description;

    private Long categoryId;

    private String creationDate;

    private String updateDate;

    private String lastPurchasedDate;

    public Product(){}

    public Product(String name, String description, Long categoryId) {
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getLastPurchasedDate() {
        return lastPurchasedDate;
    }

    public void setLastPurchasedDate(String lastPurchasedDate) {
        this.lastPurchasedDate = lastPurchasedDate;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Product))
            return false;
        Product product = (Product) o;
        return Objects.equals(this.id, product.id) && Objects.equals(this.name, product.name)
                && Objects.equals(this.categoryId, product.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.categoryId);
    }

    @Override
    public String toString() {
        return "Product{" + "id = " + this.id + ", name = '" + this.name + '\'' + ", categoryId = '" + this.categoryId + '\'' +
                 ", creationDate = '" + this.creationDate + '\'' + ", updateDate = '" + this.updateDate + '\'' +
                 ", lastPurchasedDate = '" + this.lastPurchasedDate + '\''  + '}';
    }
}
