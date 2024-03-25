package com.codegravity.firstproject;

import UserModel.UserDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

        String flag = "0";
        String flag1 = "1";
        String name;


    @RequestMapping(path="/login" )
        public String loginValidation(@ModelAttribute UserDataModel user) {
        System.out.println(user.getFirstName());
        System.out.println(user.getUserPassword());
        if (user.getFirstName().equals("Samrat") && user.getUserPassword().equals("qwerty")) {
            System.out.println("I am true");
            return "redirect:profile";
        } else {
            System.out.println(user.getFirstName());
            System.out.println("I am false");
            return "redirect:register";
        }
    }
        @RequestMapping(path = "/profile")
        public String viewProfile(@ModelAttribute UserDataModel user){
            return "profile";
        }

        @GetMapping (path = "/register")
        public String registrationValidation(@ModelAttribute UserDataModel user){
            return "register";
        }

        @GetMapping(path = "/updatePassword")
        public String editPassword(@ModelAttribute UserDataModel user){
            return "changePassword";
        }

        @GetMapping(path = "updateProfile")
        public String updateProfile(@ModelAttribute UserDataModel user){
            return "updateProfile";
        }


    }

