package com.sallyschristmas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sallyschristmas.entity.Sapp;
import com.sallyschristmas.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    
    @GetMapping("/")
    public String index(HttpSession session) {
        
        Sapp loggedInUser = (Sapp) session.getAttribute("loggedInUser");

        System.out.println(loggedInUser.toString());
        return "home";
    }

    @GetMapping("/signUp")
    public String signUp(Model model) {

        model.addAttribute("user", new Sapp());
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@ModelAttribute Sapp user, Model model) {

        userService.save(user);

        model.addAttribute("user", new Sapp());

        return "signIn";

    }
    
    @GetMapping("/signIn")
    public String signIn(Model model) {

        model.addAttribute("user", new Sapp());
        return "signIn";
    }

    @PostMapping("/signIn")
    public String signIn(@ModelAttribute Sapp user, Model model, HttpSession session) {

        Sapp loggedInUser = userService.findByEmailAndPassword(user);

        session.setAttribute("loggedInUserId", loggedInUser.getId());

        model.addAttribute("loggedInUser", loggedInUser);

        return "home";

    }

}
