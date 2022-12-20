package com.sallyschristmas.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sallyschristmas.entity.Cart;
import com.sallyschristmas.entity.CreditCard;
import com.sallyschristmas.entity.Product;
import com.sallyschristmas.entity.Sapp;
import com.sallyschristmas.service.CartService;
import com.sallyschristmas.service.CreditCardService;
import com.sallyschristmas.service.UserService;

@Controller
public class CartController {
    
    @Autowired
    UserService userService;
    
    @Autowired
    CartService cartService;
    
    @Autowired
    CreditCardService creditCardService;

    @GetMapping("/cart")
    public String cart(HttpSession session, Model model) {

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            Sapp loggedInUser = userService.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
        }

        return "cart";
    }

    @PostMapping("/cart/{creditCardId}")
    public String cart(@PathVariable Integer creditCardId, HttpSession session, Model model) {

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            Sapp loggedInUser = userService.findUserById(loggedInUserId);
            
            CreditCard creditCard = creditCardService.getById(creditCardId);
            Boolean didTransactionGoThrough = creditCardService.makePurchase(loggedInUser.getCart().getTotalPrice(), creditCard);

            if(didTransactionGoThrough) {
                /* Show Details Page */

                // get the bought products to show on confirmation page
                List<Product> purchasedCart = new ArrayList<>(loggedInUser.getCart().getProducts());
                // get the price aswell to show
                Double price = loggedInUser.getCart().getTotalPrice();

                cartService.clearCart(loggedInUser);

                model.addAttribute("price", price);
                model.addAttribute("purchasedProducts", purchasedCart);
                model.addAttribute("loggedInUser", loggedInUser);
                
                
                return "confirmation";
            } else {

                model.addAttribute("message", "You broke!");
                model.addAttribute("loggedInUser", loggedInUser);
                return "cart";
            }
        }
        

        return "";
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
