package com.example.ems.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private Double salary;
}
