package com.example.springbootpractice.service;

import com.example.springbootpractice.entity.Employee;
import com.example.springbootpractice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    public Employee save( Employee Employee) {
        return employeeRepository.save(Employee);
    }
}
