package com.pranay.loginregistrationapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranay.loginregistrationapp.Entities.Users;
import com.pranay.loginregistrationapp.Repository.UsersRepo;

@Service
public class UserService {
    @Autowired
    private UsersRepo usersRepo;

    public Users saveTask(Users user) {
        return usersRepo.save(user);
    }

    public Users updateData(Users user,int id) {
        Users userDetails = usersRepo.findById(id).orElse(null);
        if (userDetails != null) {
            userDetails.setUserName(user.getUserName());
            userDetails.setUserEmail(user.getUserEmail());
            userDetails.setUserPassword(user.getUserPassword());
            userDetails.setUserPhone(user.getUserPhone());
            userDetails.setUserCity(user.getUserCity());
            userDetails.setUserState(user.getUserState());
            userDetails.setUserAddress(user.getUserAddress());
            usersRepo.save(userDetails);
            return userDetails;
        }
        return null;
    }
}
