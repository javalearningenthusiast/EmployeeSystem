package com.example.employeemanagement.controller;

import com.example.employeemanagement.dto.EmployeeDto;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping(value="/employee")
    ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }
    @PostMapping(value="/employee")
    ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto request){
        return new ResponseEntity<>(employeeService.addEmployee(request), HttpStatus.OK);
    }
    @PutMapping(value="/employee")
    ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto request){
        return new ResponseEntity<>(employeeService.updateEmployee(request), HttpStatus.OK);
    }
    @DeleteMapping(value="/employee/{id}")
    ResponseEntity<?> deleteEmployees(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().build();
    }
}
