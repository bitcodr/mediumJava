package com.medium.instance.controllers;


import com.medium.instance.models.user.WebUser;
import com.medium.instance.repositories.WebUserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class AuthController {

    private final WebUserRepository userRepository;

    AuthController(WebUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(path = "/register")
    public @ResponseBody
    String registerUser(@Valid @RequestBody WebUser webuser) {
        this.userRepository.save(webuser);
        return "done";
    }


    @PostMapping(path = "/login")
    public @ResponseBody
    UUID login() {
        return UUID.fromString("ok");
    }


    @GetMapping(path = "/{userID}")
    public ResponseEntity<WebUser> getUser(@PathVariable String userID) {
        WebUser user = new WebUser();
        user.setFirstName("alex");
        return new ResponseEntity<WebUser>(user, HttpStatus.OK);
    }


    @GetMapping
    public @ResponseBody
    WebUser[] getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                       @RequestParam(value = "limit", defaultValue = "10") int limit,
                       @RequestParam(value = "sort", required = false) String sort) {
        return null;
    }


}