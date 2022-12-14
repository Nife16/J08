package com.sallyschristmas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sallyschristmas.entity.Product;
import com.sallyschristmas.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;


    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }
    
}
