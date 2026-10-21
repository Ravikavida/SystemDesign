package com.dsa.systemdesign.repository;


import com.dsa.systemdesign.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

     public default Employee getEmployee(int id){

         Employee emp = new Employee();
         emp.setId(100);
         emp.setAge(26);
         emp.setDept("DSA");
         emp.setName("hello");
         return emp;
    }
}
