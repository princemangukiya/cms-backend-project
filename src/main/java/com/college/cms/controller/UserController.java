package com.college.cms.controller;

import com.college.cms.entity.User;
import com.college.cms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        if (user.getEmailId() == null || user.getPassword() == null) {
            throw new RuntimeException("Email or Password cannot be empty");
        }

        User loggedInUser = userService.loginUser(user.getEmailId(), user.getPassword());

        if (loggedInUser == null) {
            throw new RuntimeException("Invalid email or password");
        }
        return loggedInUser;
    }
}