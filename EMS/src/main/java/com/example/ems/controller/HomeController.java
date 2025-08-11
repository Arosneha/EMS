package com.example.ems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/admin/home")
    public String adminHome() {
        return "Admin Home Page";
    }

    @GetMapping("/user/home")
    public String userHome() {
        return "User Home Page";
    }

    @GetMapping("/home/login")
    public String loginPrompt() {
        return "Please login";
    }
}
