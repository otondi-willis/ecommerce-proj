package com.willis.ecom_proj.repository;

import com.willis.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    //JPQL- same as SQL in SQL we use tables,column names here we use class names, field names
    @Query("SELECT p from Product p WHERE "+"LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR" +
            " " + "SELECT p from Product p WHERE "+"LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR"
    + "SELECT p from Product p WHERE "+"LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR"
    +"SELECT p from Product p WHERE "+"LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Product> searchProducts(String keyword);
}
