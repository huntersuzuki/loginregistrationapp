package com.pranay.loginregistrationapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pranay.loginregistrationapp.Entities.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users,Integer> {
    
}
