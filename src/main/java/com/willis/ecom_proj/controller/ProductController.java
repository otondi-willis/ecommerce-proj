package com.willis.ecom_proj.controller;

import com.willis.ecom_proj.model.Product;
import com.willis.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;
    @RequestMapping("/")
    public String greet(){
        return "hello world";
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id){
        return service.getProductById(id);
    }
}
