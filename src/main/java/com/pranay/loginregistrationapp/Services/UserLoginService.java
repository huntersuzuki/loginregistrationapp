package com.pranay.loginregistrationapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranay.loginregistrationapp.Entities.Users;
import com.pranay.loginregistrationapp.Repository.UsersRepo;

@Service
public class UserLoginService {

    @Autowired
    UsersRepo usersRepo;

    public String CheckEmail(Users users) {
        Users email = usersRepo.findByUserEmail(users.getUserEmail());
        Users password = usersRepo.findByUserPassword(users.getUserPassword());
        if (email != null && password != null) {
            return "Log in successful";
        } else {

            return "log in failed";
        }
    }

}
