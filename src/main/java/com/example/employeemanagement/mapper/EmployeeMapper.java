package com.example.employeemanagement.mapper;

import com.example.employeemanagement.dto.EmployeeDto;
import com.example.employeemanagement.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeMapper EMPLOYEE_MAPPER= Mappers.getMapper(EmployeeMapper.class);
    Employee EmployeeDtoToEmployee(EmployeeDto employeeDto);
    EmployeeDto EmployeeToEmployeeDto(Employee employee);
}
