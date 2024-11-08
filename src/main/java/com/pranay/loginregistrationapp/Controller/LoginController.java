package com.pranay.loginregistrationapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pranay.loginregistrationapp.Entities.Users;
import com.pranay.loginregistrationapp.Services.UserLoginService;

@RestController
public class LoginController {

    @Autowired
    UserLoginService userLoginService;

    @PostMapping("/login")
    public String CheckEmail(@RequestBody Users users) {
        return userLoginService.CheckEmail(users).toString();
    }
}
