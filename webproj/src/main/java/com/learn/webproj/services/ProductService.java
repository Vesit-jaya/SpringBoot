package com.learn.webproj.services;

import com.learn.webproj.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {


    List<Product> productList= Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Bike",400000)
    );

    public List<Product> getProductList(){
        return productList;
    }
}

