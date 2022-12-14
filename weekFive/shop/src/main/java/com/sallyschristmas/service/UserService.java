package com.sallyschristmas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sallyschristmas.entity.Sapp;
import com.sallyschristmas.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

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
    
}
