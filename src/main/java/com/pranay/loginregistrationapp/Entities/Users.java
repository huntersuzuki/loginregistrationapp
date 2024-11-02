package com.pranay.loginregistrationapp.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @NotNull
    @NotBlank
    private String userName;
    @NotNull
    @NotBlank
    @Email
    private String userEmail;
    @NotNull
    @NotBlank
    private String userPassword;
    @NotNull
    private Long userPhone;
    @NotNull
    @NotBlank
    private String userCity;
    @NotNull
    @NotBlank
    private String userState;
    @NotNull
    @NotBlank
    private String userAddress;
}
