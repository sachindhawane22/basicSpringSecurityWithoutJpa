package com.example.ss.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class UserController {

    @GetMapping("/helloAdmin")
    public String sayHelloToAdmin(){
        return "Hello Admin";
    }

    @GetMapping("/helloUser")
    public String sayHelloToUser(){
        return "Hello User";
    }
}
