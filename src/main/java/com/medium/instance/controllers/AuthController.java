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
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
public class AuthController {


    @Autowired
    private WebUserService userService;


    @PostMapping(path = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<WebUserResponse> registerUser(@Valid @RequestBody WebUserRequest request) {

        ModelMapper dtoMapper = new ModelMapper();
        WebUserDTO webuserDTO = dtoMapper.map(request,WebUserDTO.class);
        WebUserDTO userCreated = userService.createWebUser(webuserDTO);

        ModelMapper responseMapper = new ModelMapper();
        WebUserResponse response = responseMapper.map(userCreated,WebUserResponse.class);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


//    @PostMapping(path = "/login")
//    public UUID login() {
//        return UUID.fromString("ok");
//    }
//
//
//    @GetMapping(path = "/{userID}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity<WebUserDTO> getUser(@PathVariable String userID) {
//        WebUserDTO user = new WebUserDTO();
//        user.setFirstName("alex");
//        return new ResponseEntity<WebUserDTO>(user, HttpStatus.OK);
//    }
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