package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

//    public String getUserById(@PathVariable int id) {
//        System.out.println(id);
//        return "Get user information by ID";
//    }

    @Autowired//KEY
    private UserMapper userMapper;
    @GetMapping("/user/{id}")
    public List queryById(@PathVariable int id) {
        List<User> list = userMapper.selectList(null);
        System.out.println(list);
        return list;
    }
    @PostMapping("/user")
    public String save(User user) {
        int i = userMapper.insert(user);
        System.out.println(user);
        if (i > 0) {
            return "Add user success";
        }
        else {
            return "Add user failed";
        }
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
