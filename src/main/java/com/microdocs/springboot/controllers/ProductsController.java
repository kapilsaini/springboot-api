package com.microdocs.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microdocs.springboot.vo.Product;

@RestController
@EnableAutoConfiguration
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsController {

	@Autowired
    private ProductsRepository repository;
	
    @RequestMapping("/products")
    List<Product> home() {
      return repository.findAll();
    }

    @RequestMapping("/product/{id}")
    Product home(@PathVariable("id") int id) {
    	return repository.findById(id);
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProductsController.class, args);
    }

}
