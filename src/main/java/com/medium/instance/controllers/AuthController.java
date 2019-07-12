package com.medium.instance.controllers;

import com.medium.instance.repositories.WebUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping(path = "/api/v1")
public class AuthController {

    @Autowired
    private WebUserRepository userRepository;

    @PostMapping(path = "/register-user")
    public @ResponseBody String registerUser() {
        return "hello world";
    }


    @GetMapping(path="/login-user")
    public @ResponseBody UUID login(){
        return UUID.fromString("ok");
    }


}