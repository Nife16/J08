package com.sallyschristmas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sallyschristmas.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}
