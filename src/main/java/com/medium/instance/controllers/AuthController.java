package com.medium.instance.controllers;


import com.medium.instance.models.user.WebUser;
import com.medium.instance.repositories.WebUserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class AuthController {

    Map<String, WebUser> users;

    private final WebUserRepository userRepository;

    AuthController(WebUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(path = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<WebUser> registerUser(@Valid @RequestBody WebUser webuser) {
        this.userRepository.save(webuser);
        return new ResponseEntity<WebUser>(webuser, HttpStatus.CREATED);
    }


    @PostMapping(path = "/login")
    public UUID login() {
        return UUID.fromString("ok");
    }


    @GetMapping(path = "/{userID}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<WebUser> getUser(@PathVariable String userID) {
        WebUser user = new WebUser();
        user.setFirstName("alex");
        return new ResponseEntity<WebUser>(user, HttpStatus.OK);
    }


    @GetMapping
    public WebUser[] getUsers(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "10") int limit, @RequestParam(value = "sort", required = false) String sort) {
        return null;
    }

    @PutMapping(path = "/{userID}", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public WebUser updateUser(@PathVariable String userID, @Valid @RequestBody WebUser webuser){
        if(users.containsKey(userID))
        {
            WebUser oldUser = users.get(userID);
            oldUser.setFirstName(webuser.getFirstName());
            users.put(userID,oldUser);
            return webuser;
        }
       return null;
    }


}