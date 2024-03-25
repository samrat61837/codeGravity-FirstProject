package com.codegravity.firstproject;

import UserModel.UserDataModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(FirstProjectApplication.class, args);
        UserDataModel userData = new UserDataModel();
        MainController con = new MainController();
        con.registrationValidation(userData);
    }

}
