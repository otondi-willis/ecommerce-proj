package com.willis.ecom_proj.service;

import com.willis.ecom_proj.model.Product;
import com.willis.ecom_proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
