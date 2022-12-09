package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.User;

/*
 * Service files are made to do logic
 * CRUD FUNCTIONALITY!!!!!
 */
public class UserService {
    
    int idCounter = 1;
    List<User> ourSapps = new ArrayList<User>();

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
        user.setId(idCounter);
        ourSapps.add(user);
        idCounter++;
        return user;
    }

    public boolean isPasswordLongEnough(String password) {
        if(password.length() > 6) {
            return true;
        }
        return false;
    }

    public boolean doesUsernameExist(String username) {
        for(int i = 0; i < ourSapps.size(); i++) {
            if(username.equals(ourSapps.get(i).getUsername())) {
                return true;
            }
        }

        return false;
    }

    // function to update

    public void updateUser() {


    }

    // function to read

    public User getUserByEmailAndPassword(String username, String password) {
        
        // Loop through our list of signed up users to find the correct user to sign in
        for (int i = 0; i < ourSapps.size(); i++) {
            
            if(username.equals(ourSapps.get(i).getUsername()) &&
                password.equals(ourSapps.get(i).getPassword())) {
                    return ourSapps.get(i);
            }

        }

        return null;

    }

    // function to delete

    public void deleteUser(String username, String password) {

        for (int i = 0; i < ourSapps.size(); i++) {
            
            if(username.equals(ourSapps.get(i).getUsername()) &&
                password.equals(ourSapps.get(i).getPassword())) {
                    ourSapps.remove(i);
            }

        }

    }

    


}
