package com.codegravity.firstproject;

import UserModel.UserDataModel;

public class ValidationController {

    public String loginCheck(UserDataModel user){
        if (user.getFirstName() == "samrat" && user.getUserPassword()== "qwerty"){
            return "profile";
        }else {
            return "index";
        }
    }
}
