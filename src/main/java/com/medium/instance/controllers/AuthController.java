package com.medium.instance.controllers;


import com.medium.instance.models.user.WebUser;
import com.medium.instance.repositories.WebUserRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1")
public class AuthController {

    private final WebUserRepository userRepository;

    AuthController(WebUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostMapping(path = "/register-user")
    public @ResponseBody String registerUser(@Valid @RequestBody WebUser webuser) {
        this.userRepository.save(webuser);
        return "done";
    }


    @PostMapping(path="/login-user")
    public @ResponseBody UUID login(){
        return UUID.fromString("ok");
    }


}