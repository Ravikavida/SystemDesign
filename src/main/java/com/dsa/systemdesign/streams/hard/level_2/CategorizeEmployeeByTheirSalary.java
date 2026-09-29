package com.dsa.systemdesign.streams.hard.level_2;

import com.dsa.systemdesign.streams.medium.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategorizeEmployeeByTheirSalary {

   private static SalaryEnum getRange(Double salary){
        if(salary<= 50000){
            return  SalaryEnum.LOW;
        } else if (salary > 50000 && salary <= 100000) {
            return SalaryEnum.MEDIUM;
        }else
            return SalaryEnum.HIGH;
    }

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(10, "Ravi", 10000.00,"IT"),
                new Employee(11, "teja", 20000.00,"IT"),
                new Employee(12, "balaya", 70000.00,"CSE"),
                new Employee(13, "kumar", 1200000,"ECE"),
                new Employee(14, "Ravi", 25000.00,"ECE"));

        Map<SalaryEnum,List<Employee>> result = empList.stream().collect(Collectors.groupingBy(e -> getRange(e.getSalary())
        ));

System.out.println(result);

    }
}
