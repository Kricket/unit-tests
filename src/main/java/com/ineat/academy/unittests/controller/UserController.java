package com.ineat.academy.unittests.controller;

import com.ineat.academy.unittests.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}/fullname")
    public String getFullName(@PathVariable("id") String userId) {
        return userService.getFullName(userId);
    }
}
