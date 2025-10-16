package com.wade.springboot.springboot_feature_demo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equalsIgnoreCase("testn");
        boolean isValidPassword = password.equalsIgnoreCase("testp");

        return isValidUserName && isValidPassword;
    }
}