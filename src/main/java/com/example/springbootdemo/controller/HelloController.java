package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello, world!!!!!!";
//    }

    //   http://localhost:8080/hello
    //More formal way
    @RequestMapping(value = "/hello", method = RequestMethod.GET)//说明前端请求类型为GET，只能接受GET请求
    //equals to @GetMapping("/hello")
    public String hello() {
        return "Hello, world!!!!!!";
    }
    //   http://localhost:8080/hello?nickname=sam
    public String hello(String nickname) {
        return "Hello, " + nickname;
    }

}
