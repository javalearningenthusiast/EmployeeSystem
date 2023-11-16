package com.example.employeemanagement.service;

import com.example.employeemanagement.dto.EmployeeRequestDto;
import com.example.employeemanagement.dto.EmployeeResponseDto;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    private EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    @Override
    public List<EmployeeResponseDto> getAllEmployees() {
        return null;
    }

    @Override
    public EmployeeResponseDto addEmployee(EmployeeRequestDto request) {
        return null;
    }

    @Override
    public EmployeeResponseDto updateEmployee(EmployeeRequestDto request) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
