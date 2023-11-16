package com.example.employeemanagement.controller;

import com.example.employeemanagement.dto.EmployeeRequestDto;
import com.example.employeemanagement.dto.EmployeeResponseDto;
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
    ResponseEntity<List<EmployeeResponseDto>> getAllEmployees(){
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }
    @PostMapping(value="/employee")
    ResponseEntity<EmployeeResponseDto> addEmployee(@RequestBody EmployeeRequestDto request){
        return new ResponseEntity<>(employeeService.addEmployee(request), HttpStatus.OK);
    }
    @PutMapping(value="/employee")
    ResponseEntity<EmployeeResponseDto> updateEmployee(@RequestBody EmployeeRequestDto request){
        return new ResponseEntity<>(employeeService.updateEmployee(request), HttpStatus.OK);
    }
    @DeleteMapping(value="/employee/{id}")
    ResponseEntity<?> deleteEmployees(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().build();
    }
}
