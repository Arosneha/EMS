package com.example.ems.service;

import com.example.ems.dto.UserRegistrationDto;
import com.example.ems.entity.User;

import java.util.Optional;

public interface RegistrationService {
    User register(UserRegistrationDto dto);

    Optional<User> findByUsername(String username);  // add this
}
