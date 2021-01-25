package com.loginbackend.controller;

import com.loginbackend.model.User;
import com.loginbackend.model.UserDto;
import com.loginbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getOne(@PathVariable(value = "id") Long id){
        return userService.findById(id);
    }


    @RequestMapping(value="/register", method = RequestMethod.POST)
    public User saveUser(@RequestBody UserDto user){
        return userService.save(user);

    }

}
