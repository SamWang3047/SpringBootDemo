package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id) {
        System.out.println(id);
        return "Get user information by ID";
    }
    @PostMapping("/user")
    public String save(User user) {
        return "Add user";
    }

    @PutMapping("/user")
    public String update(User user) {
        return "Update user";
    }

    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable int id) {
        System.out.println(id);
        return "Delete user by ID";
    }
}
