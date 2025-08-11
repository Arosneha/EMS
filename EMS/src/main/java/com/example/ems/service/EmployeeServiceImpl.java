package com.example.ems.service;

import com.example.ems.entity.Employee;
import com.example.ems.exception.ResourceNotFoundException;
import com.example.ems.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repo;

    @Override
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found: " + id));
    }

    @Override
    public Employee create(Employee emp) {
        return repo.save(emp);
    }

    @Override
    public Employee update(Long id, Employee emp) {
        Employee existing = getById(id);
        existing.setFirstName(emp.getFirstName());
        existing.setLastName(emp.getLastName());
        existing.setEmail(emp.getEmail());
        existing.setDepartment(emp.getDepartment());
        existing.setSalary(emp.getSalary());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Employee> searchByFirstName(String name) {
        return repo.findByFirstNameContainingIgnoreCase(name);
    }
}
