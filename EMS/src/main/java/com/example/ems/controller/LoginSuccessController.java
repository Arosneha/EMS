package com.example.ems.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginSuccessController {
    @GetMapping("/default")
    public String defaultAfterLogin(Authentication auth) {
        if (auth.getAuthorities().stream().anyMatch(a
                -> a.getAuthority().equals("ROLE_ADMIN"))) {
            return "redirect:/admin/home";
        } else if (auth.getAuthorities().stream().anyMatch(a
                -> a.getAuthority().equals("ROLE_USER"))) {
            return "redirect:/user/home";
        }
        return "redirect:/login?error";
    }
}

