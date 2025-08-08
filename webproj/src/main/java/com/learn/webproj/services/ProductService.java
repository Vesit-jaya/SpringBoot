package com.learn.webproj.services;

import com.learn.webproj.model.Product;
import com.learn.webproj.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {


//    List<Product> productList=new ArrayList<>( Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Bike",400000)
//    ));
@Autowired
    ProductRepo repo;


    public List<Product> getProductList(){
//        return productList;
        return repo.findAll();
    }


    public Product getProductById(int id) {

//        return productList.stream().filter(p ->p.getProductID()==id).findFirst().orElse(new Product(100,"House",6000000));

        return repo.findById(id).get();
    }

    public void addProduct(Product product) {
//        productList.add(product);
        repo.save(product);
    }

    public void UpdateProduct(Product product) {

//        int index=0;
//        for(int i=0;i<productList.size();i++)
//        {
//            if(productList.get(i).getProductID()==product.getProductID())
//            {
//
//
//                productList.set(i,product);
//                break;
//            }
        repo.save(product);

        }
    public void deleteProductById(int id) {
//        productList.removeIf(p ->p.getProductID()==id);
        repo.deleteById(id);
    }

    }




