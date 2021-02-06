package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class UserController {


    @GetMapping("/getUser")
    public String getUser(){
        String user = "{'name':'张三','age':21}";
        return user;
    }
}
