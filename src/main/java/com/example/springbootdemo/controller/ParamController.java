package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParamController {
    /*GET Request*/
    //   http://localhost:8080/getTest1
    @RequestMapping(value = "/getTest1", method = RequestMethod.GET)
    public String getTest1() {
        return "GET Request1";
    }

    //   http://localhost:8080/getTest2?nickname=sam&phone=123
    @RequestMapping(value = "/getTest2", method = RequestMethod.GET)
    public String getTest2(String nickname, String phone) {
        System.out.println(nickname);
        System.out.println(phone);
        return "GET Request2";
    }

    @RequestMapping(value = "/getTest3", method = RequestMethod.GET)
    //@RequestParam("nickname") String name 默认访问必须带上参数，否则报错
    public String getTest3(@RequestParam("nickname") String name) {
        System.out.println("nickname: " + name);
        return "GET Request3";
    }

    /*POST Request*/
    @RequestMapping(value = "/postTest1", method = RequestMethod.POST)
    public String postTest1() {
        return "POST Request1";
    }

    @RequestMapping(value = "/postTest2", method = RequestMethod.POST)
    public String postTest2(String username, String password) {
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return "POST Request2";
    }

    @RequestMapping(value = "/postTest3", method = RequestMethod.POST)
    public String postTest3(User user) {
        System.out.println(user);
        return "POST Request3";
    }

    @RequestMapping(value = "/postTest4", method = RequestMethod.POST)
    public String postTest4(@RequestBody User user) {
        //User类中变量名称与类型必须与JSON内相同
        System.out.println(user);
        return "POST Request4";
    }

    @GetMapping(value = "/test/**")
    public String test() {
        return "General Test";
    }
}
