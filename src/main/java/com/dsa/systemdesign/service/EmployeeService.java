package com.dsa.systemdesign.service;


import com.dsa.systemdesign.Repository.EmployeeRepository;
import com.dsa.systemdesign.dto.EmployeeDto;
import com.dsa.systemdesign.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    public EmployeeDto getEmployeeDetails(int id){
       Employee employee =   employeeRepository.getEmployee(id);
        EmployeeDto dto = new EmployeeDto();
        dto.setDept(employee.getDept());
        dto.setName(employee.getName());
        dto.setId(employee.getId());

        return dto;

    }
}
