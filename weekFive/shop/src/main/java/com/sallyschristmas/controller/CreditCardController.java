package com.sallyschristmas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sallyschristmas.entity.CreditCard;
import com.sallyschristmas.entity.Sapp;
import com.sallyschristmas.service.CreditCardService;
import com.sallyschristmas.service.UserService;

@Controller
public class CreditCardController {

    @Autowired
    UserService userService;
    @Autowired
    CreditCardService creditCardService;

    @GetMapping("/addCreditCard")
    public String addCreditCard(HttpSession session, Model model) {
        
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            Sapp loggedInUser = userService.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);
        }

        model.addAttribute("creditCard", new CreditCard());

        return "addCreditCard";
    }
    
    @PostMapping("/addCreditCard")
    public String addCreditCard(@ModelAttribute("creditCard") CreditCard creditCard, HttpSession session, Model model) {
        
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            Sapp loggedInUser = userService.findUserById(loggedInUserId);

            creditCardService.save(creditCard);

            userService.addCreditCard(creditCard, loggedInUser);

            model.addAttribute("loggedInUser", loggedInUser);

            return "cart";
        }

        return "home";
    }
    
}
