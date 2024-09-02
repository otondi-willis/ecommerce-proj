package com.willis.ecom_proj.controller;

import com.willis.ecom_proj.model.Product;
import com.willis.ecom_proj.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private ProductService service;
    @RequestMapping("/")
    public String greet(){
        return "hello world";
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}
