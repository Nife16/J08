package com.sallyschristmas.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sallyschristmas.entity.Sapp;
import com.sallyschristmas.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    
    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");

        if(loggedInUserId != null) {
            System.out.println(loggedInUserId);
            Sapp loggedInUser = userService.findUserById(loggedInUserId);
            model.addAttribute("loggedInUser", loggedInUser);

        }
        return "home";
    }

    @GetMapping("/signUp")
    public String signUp(Model model) {

        model.addAttribute("user", new Sapp());
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@ModelAttribute Sapp user, Model model) {

        userService.createAccount(user);

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

        if(loggedInUser != null) {
            session.setAttribute("loggedInUserId", loggedInUser.getId());

            model.addAttribute("loggedInUser", loggedInUser);

            return "home";
        } else {
            model.addAttribute("message", "You don't have an account.");
            return "signIn";
        }

    }

    @PostMapping("/signOut")
    public ModelAndView signOut(HttpSession session) {

        session.removeAttribute("loggedInUserId");

        return new ModelAndView("home");
    }

}
