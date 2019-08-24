package com.medium.instance.controllers;


import com.medium.instance.models.DTO.user.WebUserDTO;
import com.medium.instance.models.request.WebUserRequest;
import com.medium.instance.models.response.user.WebUserResponse;
import com.medium.instance.services.WebUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
@Validated
public class AuthController extends Controller<WebUserResponse, WebUserRequest> {


    @Autowired
    private WebUserService userService;

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<WebUserResponse> get(@PathVariable String userID) {
        WebUserResponse user = new WebUserResponse();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<WebUserResponse> list() {
        WebUserResponse user = new WebUserResponse();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<WebUserResponse> insert(@RequestBody @Valid WebUserRequest request) {
        ModelMapper dtoMapper = new ModelMapper();
        WebUserDTO webuserDTO = dtoMapper.map(request, WebUserDTO.class);
        WebUserDTO userCreated = userService.createWebUser(webuserDTO);
        ModelMapper responseMapper = new ModelMapper();
        WebUserResponse response = responseMapper.map(userCreated, WebUserResponse.class);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @Override
    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<WebUserResponse> update(@Valid @RequestBody WebUserRequest request) {
        WebUserResponse user = new WebUserResponse();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    @DeleteMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<WebUserResponse> delete(@PathVariable String id) {
        WebUserResponse user = new WebUserResponse();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }



//
//
//    @GetMapping
//    public WebUserDTO[] getUsers(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "limit", defaultValue = "10") int limit, @RequestParam(value = "sort", required = false) String sort) {
//        return null;
//    }
//
//    @PutMapping(path = "/{userID}", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//    public WebUserDTO updateUser(@PathVariable String userID, @Valid @RequestBody WebUserDTO webuser) {
//        if (this.users.containsKey(userID)) {
//            WebUserDTO oldUser = this.users.get(userID);
//            oldUser.setFirstName(webuser.getFirstName());
//            this.users.put(userID, oldUser);
//            return webuser;
//        }
//        return null;
//    }
//
//
//    @DeleteMapping(path = "/{userID}")
//    public ResponseEntity<Void> deleteUser(@PathVariable String userID){
//        users.remove(userID);
//        return ResponseEntity.ok().build();
//    }

}