package com.sallyschristmas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sallyschristmas.entity.CreditCard;

@Repository
public interface CreditCardRepo extends JpaRepository<CreditCard, Integer> {
    
}
