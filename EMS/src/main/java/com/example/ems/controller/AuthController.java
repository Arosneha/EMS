package com.example.ems.controller;

import com.example.ems.dto.UserRegistrationDto;
import com.example.ems.entity.User;
import com.example.ems.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final RegistrationService registrationService;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegistrationDto dto) {
        try {
            User user = registrationService.register(dto);
            return ResponseEntity.ok(Map.of("message", "Registered: " + user.getUsername()));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("message", e.getMessage()));
        }
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserRegistrationDto dto, HttpServletRequest request) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword())
            );

            SecurityContextHolder.getContext().setAuthentication(authentication);


            request.getSession(true);


            User user = registrationService.findByUsername(dto.getUsername())
                    .orElseThrow(() -> new RuntimeException("User not found"));

            return ResponseEntity.ok(new LoginResponse(user.getUsername(), user.getRole().name()));
        } catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }


    public record LoginResponse(String username, String role) {}
}
