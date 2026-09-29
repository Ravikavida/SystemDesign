package com.dsa.systemdesign.streams.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDeptByEmployeeWhoseCountGreaterThan_Two {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(10, "Ravi", 10000.00,"IT"),
                new Employee(11, "teja", 20000.00,"IT"),
                new Employee(12, "balaya", 70000.00,"CSE"),
                new Employee(13, "kumar", 60000.00,"ECE"),
                new Employee(14, "Ravi", 25000.00,"ECE"),
                new Employee(13, "kumar", 60000.00,"EEE"),
                new Employee(14, "Ravi", 25000.00,"ECE"),
                new Employee(10, "Ravi", 10000.00,"IT"),
                new Employee(11, "teja", 20000.00,"IT"));

        List<String> empResult = empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting())).entrySet().stream().filter(data ->data.getValue() > 2).map(Map.Entry::getKey).toList();

        System.out.println(empResult);
    }
}
