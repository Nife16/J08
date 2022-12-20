package com.sallyschristmas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sallyschristmas.entity.Cart;
import com.sallyschristmas.entity.CreditCard;
import com.sallyschristmas.entity.Sapp;
import com.sallyschristmas.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    
    @Autowired
    CartService cartService;

    public Sapp createAccount(Sapp user) {

        // 1) Save your cart for your user
        Cart cart = cartService.save(new Cart());
        // 2) Add the cart to the user object so they can have one
        user.setCart(cart);
        // 3) Save the user
        return save(user);
    }
    
    public Sapp save(Sapp user) {
        return userRepo.save(user);
    }
    
    public Sapp findByEmailAndPassword(Sapp user) {
        return userRepo.findByEmailAndPassword(user.getUsername(), user.getPassword());
    }

    public Sapp findUserById(Integer userId) {
        return userRepo.findById(userId).get();
    }

    public List<Sapp> findAllSapps() {
        return userRepo.findAll();
    }

    public Sapp addCreditCard(CreditCard creditCard, Sapp loggedInSapp) {

        loggedInSapp.getDaBank().add(creditCard);
        return save(loggedInSapp);
    }
    
}
