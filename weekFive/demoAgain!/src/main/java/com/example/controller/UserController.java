package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.User;
import com.example.service.UserService;

/*
 * Controllers are the servlet files that allow us to make requests
 * to our backend service.
 */

/* The Controller annotation lets your project know this is a Controller file
 * Controller files are where we initialize our servlets
 */
@Controller
public class UserController {
    

    @Autowired
    UserService userService;

    /*
     * Mappings let you return a specific JSP file to view on your browser
     * Get mapping works like a Get request where you are asking to get a specifc view
     */
    /*
     * The get mapping here is saying when we go to page / (homepage)
     * We are going to return a JSP page with name index
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /* In this GetMapping we are going to have a form on the page,
     * so we need to add some object to the model to keep track of our form data
     * Whenever you have a form on your page, you can always set a model attribute by just
     * adding the argument to your function
     */

    //  The URL in your mapping should match your URL on your browser
    @GetMapping("/signUp")
    public String signUp(Model model) {

        /* Add the object to your model here, since its a sign up form
         * for user data, we need to add a blank user object to the form
         * so we use our blank constructor
         */
        model.addAttribute("user", new User());

        // Finally we return the sign up page, should be same spelling as your JSP page here
        return "signUp";
    }

    /* PostMappings are for dealing with submitting forms from a page,
     * when the form is submitted, it takes the model attribute of the form with the form data
     * and allows you to process the data for your operation, in this case a sign up/create user
     */
    @PostMapping("/signUp")
    /* Your ModelAttribute should be the same exact name (case included)
     as the you set on the form in the Get Mapping */
    public String signUp(@ModelAttribute("user") User user, Model model) {

        /* We send the data to our service to do our logic and whatever it returns
         * we need to process accordingly
         */
        User loggedInUser = userService.createUser(user);

        // If the user cannot be created, we need to tell the user why
        if(loggedInUser == null) {
            // We add a message to the model incase the user couldnt be signed up properly
            model.addAttribute("message", "Your email password combo isn't valid, ya FOO!");

            // We return them to the sign up page so they can try again
            return "signUp";
        }

        // Add another blank user on model for signIn in case of a successful creation,
        // so you don't auto populate data
        model.addAttribute("user", new User());

        // return sign in so they can verify themself
        return "signIn";
    }

    @GetMapping("/signIn")
    public String signIn(Model model) {


        model.addAttribute("user", new User());

        return "signIn";
    }

    
    @PostMapping("/signIn")                 // The session allows us to store information for multiple pages
                                            // So if our user logs in, we store there data for the entire time
                                            // they are on the site
                                            // SESSION DATA CANNOT BE ACCESSED ON THE JSP,
                                            // we still the Model for putting data on each page
    public String signIn(@ModelAttribute("user") User user, HttpSession session) {

        User loggedInUser = userService.getUserByEmailAndPassword(user.getUsername(), user.getPassword());

        if(loggedInUser == null) {
            return "signIn";
        }

        session.setAttribute("loggedInUser", loggedInUser);

        return "index";

    }

    /* Here we will use the Session to get our users data for the page */
    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {
        // We get the object we stored on the session, and then we ad it to the model for our page
        User loggedInUser = (User) session.getAttribute("loggedInUser");

        model.addAttribute("user", loggedInUser);

        // Now when we make our page, we can show the users data on it
        return "profile";
        
    }   

}
