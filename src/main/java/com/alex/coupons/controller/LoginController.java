package com.alex.coupons.controller;

import com.alex.coupons.dto.UserLogin;
import com.alex.coupons.dto.UserLoginData;
import com.alex.coupons.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    private UserLogic userLogic;

    @Autowired
    public LoginController(UserLogic userLogic) {this.userLogic = userLogic;}

    @PostMapping
    public String login(@RequestBody UserLoginData loginDetailsData) throws Exception {
        return userLogic.login(loginDetailsData);


    }
}