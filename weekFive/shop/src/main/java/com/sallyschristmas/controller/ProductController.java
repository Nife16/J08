package com.sallyschristmas.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sallyschristmas.entity.Product;
import com.sallyschristmas.entity.Sapp;
import com.sallyschristmas.service.CartService;
import com.sallyschristmas.service.ProductService;
import com.sallyschristmas.service.UserService;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    UserService userService;
    

    @Autowired
    CartService cartService;
    

    @GetMapping("/product")
    public String viewAllProducts(Model model, HttpSession session) {

        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            Sapp loggedInUser = userService.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
        }

        List<Product> allProducts = productService.getAllProducts();

        model.addAttribute("allProducts", allProducts);

        return "product";
    }

    @GetMapping("/confirmation/{productId}")
    public String addToCart(@PathVariable("productId") Integer productId, HttpSession session, Model model) {

        Product product = productService.getProductById(productId);
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");
        Sapp loggedInUser;
        if(loggedInUserId != null) {
            loggedInUser = userService.findUserById(loggedInUserId);
                
            model.addAttribute("loggedInUser", loggedInUser);
                
            System.out.println(cartService.addToCart(loggedInUser, product).getCart().toString());
        } else {
            // not logged in add to cart goes here 
        }

        List<Product> allProducts = productService.getAllProducts();

        model.addAttribute("allProducts", allProducts);

        return "product";

    }


}
