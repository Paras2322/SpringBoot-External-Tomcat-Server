package com.deploy.war.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/users")
    public List getUsers(){

    return List.of("Paras","Aarushi","Twinkle");
    }
}
