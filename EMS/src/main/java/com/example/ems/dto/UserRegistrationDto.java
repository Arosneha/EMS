package com.example.ems.dto;

import com.example.ems.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationDto {
    private String username;
    private String password;
    private Role role;
}
