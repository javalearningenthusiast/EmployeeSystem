package com.example.employeemanagement.service;

import com.example.employeemanagement.dto.EmployeeDto;
import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.mapper.EmployeeMapper;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Autowired
    private  EmployeeMapper employeeMapper;

    private EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;

    }
    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll().stream().map(employee->employeeMapper.EmployeeToEmployeeDto(employee)).collect(Collectors.toList());

    }

    @Override
    public EmployeeDto addEmployee(EmployeeDto request) {
        Employee employee=EmployeeMapper.EMPLOYEE_MAPPER.EmployeeDtoToEmployee(request);
        employee= employeeRepository.save(employee);
        return EmployeeMapper.EMPLOYEE_MAPPER.EmployeeToEmployeeDto(employee);
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto request) {
        Optional<Employee> employee= employeeRepository.findById(request.getId());
        if(employee.isPresent()){
            return addEmployee(request) ;
        }
        Assert.notNull(employee,"Employee not found.");
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
       Optional<Employee> employee= employeeRepository.findById(id);
        employee.ifPresent(emp -> {
            employeeRepository.delete(emp);
        });


        Assert.notNull(employee,"Employee not found.");


    }
}
