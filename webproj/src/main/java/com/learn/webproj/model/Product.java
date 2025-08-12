package com.learn.webproj.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Product {

    @Id
    private int productID;
    private String productName;
    private int price;

@CreatedDate
@Column(updatable = false)
private LocalDateTime createdDate;

@LastModifiedDate
private LocalDateTime lastModifiedDate;

@CreatedBy
@Column(updatable = false)
private String createdBy;

@LastModifiedBy
private String lastModifiedBy;


    public Product(int productID, String productName, int price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public Product() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
