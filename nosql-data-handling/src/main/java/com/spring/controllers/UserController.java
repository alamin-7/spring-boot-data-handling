package com.spring.controllers;

import com.spring.models.UserInfo;
import com.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserInfo> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserInfo createUser(@RequestBody UserInfo user) {
        return userService.saveUser(user);
    }
}
