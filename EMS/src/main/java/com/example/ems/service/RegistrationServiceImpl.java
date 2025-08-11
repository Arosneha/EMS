package com.example.ems.service;

import com.example.ems.dto.UserRegistrationDto;
import com.example.ems.entity.User;
import com.example.ems.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public User register(UserRegistrationDto dto) {
        userRepository.findByUsername(dto.getUsername()).ifPresent(u -> {
            throw new RuntimeException("Username already exists");
        });

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setRole(dto.getRole() == null ? com.example.ems.entity.Role.ROLE_USER : dto.getRole());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
