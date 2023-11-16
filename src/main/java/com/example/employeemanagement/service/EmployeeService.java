package com.example.employeemanagement.service;

import com.example.employeemanagement.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployees();

    EmployeeDto addEmployee(EmployeeDto request);

    EmployeeDto updateEmployee(EmployeeDto request);

    void deleteEmployee(Long id);
}
