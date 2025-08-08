package com.learn.webproj.controller;

import com.learn.webproj.model.Product;
import com.learn.webproj.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
     @Autowired
    ProductService service;


     @GetMapping ("/products")
public  ResponseEntity<List<Product>> getProductList()
{
    return new ResponseEntity<>(service.getProductList(), HttpStatus.OK) ;
}
@GetMapping("/products/{id}")
public ResponseEntity<Product> getProductById(@PathVariable int id)
{
    Product p=service.getProductById(id);
    if(p!=null)
    {
        return new ResponseEntity<>(p, HttpStatus.OK) ;

    }
    else
    {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND) ;
    }

}

@PostMapping("/products")
    public void addProduct(@RequestBody Product product)
{
    System.out.println(product);
    service.addProduct(product);
    System.out.println("product added");
}
@PutMapping("/products")
public void updateProduct(@RequestBody Product product)
{
    System.out.println("Updated Product:"+product);
    service.UpdateProduct(product);
    System.out.println("product updated");
}
@DeleteMapping("/products/{id}")
public  void deleteProductById(@PathVariable int id)
{
  service.deleteProductById(id);
}

}
