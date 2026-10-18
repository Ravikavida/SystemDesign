package com.dsa.systemdesign.controller;

import com.dsa.systemdesign.dto.EmployeeDto;
import com.dsa.systemdesign.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeDetails(@PathVariable int id){
        EmployeeDto result = employeeService.getEmployeeDetails(id);
        return  ResponseEntity.ok(result);
    }
}
