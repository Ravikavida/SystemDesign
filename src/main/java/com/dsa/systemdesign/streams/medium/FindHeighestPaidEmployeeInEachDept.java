package com.dsa.systemdesign.streams.medium;

import java.util.*;
import java.util.stream.Collectors;

public class FindHeighestPaidEmployeeInEachDept {
    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(10, "Ravi", 10000.00,"IT"),
                new Employee(11, "teja", 20000.00,"IT"),
                new Employee(12, "balaya", 70000.00,"CSE"),
                new Employee(13, "kumar", 60000.00,"ECE"),
                new Employee(14, "Ravi", 25000.00,"ECE"));


        Map<String, Optional<Employee>> result = empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(result);

    }

}
