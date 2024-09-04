package com.willis.ecom_proj.repository;

import com.willis.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    //JPQL- same as SQL in SQL we use tables,column names here we use class names, field names
    List<Product> searchProducts(String keyword);
}
