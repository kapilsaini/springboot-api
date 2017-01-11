package com.microdocs.springboot.controllers;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microdocs.springboot.vo.Product;

public interface ProductsRepository extends MongoRepository<Product, String> {
    public Product findById(int productId);
    public List<Product> findAll();
}
