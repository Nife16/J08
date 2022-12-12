package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepo;

/*
 * Service files are made to do logic
 * CRUD FUNCTIONALITY!!!!!
 */
@Service
public class UserService {


    @Autowired
    UserRepo userRepo;

    // function to create
    public User createUser(User user) {

        // Here we are adding validation to our form so we can control the users input to our liking
        // Find out if a username has already been taken
        if(doesUsernameExist(user.getUsername())) {
            return null;
        }
        // Find out if password is long enough
        if(!isPasswordLongEnough(user.getPassword())) {
            return null;
        }

        userRepo.save(user);

        return user;
    }

    public boolean isPasswordLongEnough(String password) {
        if(password.length() > 6) {
            return true;
        }
        return false;
    }

    public boolean doesUsernameExist(String username) {
        

        return false;
    }

    // function to update

    public void updateUser() {

        

    }

    // function to read

    public User getUserByEmailAndPassword(String username, String password) {
        
        

        return null;

    }

    // function to delete

    public void deleteUser(String username, String password) {

        

    }

    


}
