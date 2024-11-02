package com.pranay.loginregistrationapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pranay.loginregistrationapp.Entities.Users;
import com.pranay.loginregistrationapp.Services.UserService;

import jakarta.validation.Valid;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public Users saveData(@Valid @RequestBody Users user) {
        return userService.saveTask(user);
    }

    @PutMapping("/updateusers/{id}")
    public Users updateData(@PathVariable Integer id, @RequestBody Users user) {
        return userService.updateData(user,id);
    }

}
