package com.example.ems.service;

import com.example.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    public EmployeeDto createEmployee(EmployeeDto employeeDto);

    public EmployeeDto getEmployeeById(Long id);

    public List<EmployeeDto> getAllEmployees();

    public EmployeeDto updateEmployee(Long id, EmployeeDto updatedEmployee);

    public void deleteEmployee(Long id);
}
