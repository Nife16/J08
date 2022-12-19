package com.sallyschristmas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sallyschristmas.entity.Sapp;
import com.sallyschristmas.service.CartService;
import com.sallyschristmas.service.UserService;

@Controller
public class CartController {
    
    @Autowired
    UserService userService;
    
    @Autowired
    CartService cartService;

    @GetMapping("/cart")
    public String cart(HttpSession session, Model model) {

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            Sapp loggedInUser = userService.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
        }

        return "cart";
    }

    @GetMapping("/removeFromCart/{productId}")
    public String removeFromCart(@PathVariable Integer productId, Model model, HttpSession session) {
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            Sapp loggedInUser = userService.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);

            if(productId != null) {
                cartService.removeFromCart(loggedInUser, productId);
            }
        }

        

        return "cart";
    }


}
