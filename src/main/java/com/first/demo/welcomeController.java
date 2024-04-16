package com.first.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
    @GetMapping("/get")
    public String okGet(){
        return "Welcome to my first REST API response";
    }
}
