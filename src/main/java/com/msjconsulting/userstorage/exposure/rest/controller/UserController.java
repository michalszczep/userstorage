package com.msjconsulting.userstorage.exposure.rest.controller;

import com.msjconsulting.userstorage.exposure.dto.UserDTO;
import com.msjconsulting.userstorage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.ws.rs.core.MediaType;

@RestController
public class UserController {
    private UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping(value = "/users/{name}", produces = MediaType.APPLICATION_JSON)
    public UserDTO save(
        @PathVariable("name") @NotBlank String name,
        @RequestBody String password) {
        return UserDTO.from(service.save(name, password));
    }

}
