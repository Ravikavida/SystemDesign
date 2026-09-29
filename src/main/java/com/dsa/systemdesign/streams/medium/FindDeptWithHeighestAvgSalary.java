package com.dsa.systemdesign.streams.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDeptWithHeighestAvgSalary {
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

        Map.Entry<String,Double> map = empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary))).entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

        System.out.println(map);
    }
}
