package com.dsa.systemdesign.streams.hard;

import com.dsa.systemdesign.streams.medium.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostCommonFirstLetterAmongAllEmployee {

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

      Optional<Map.Entry<Character, Long>> result = empList.stream().map(emp ->emp.getName().charAt(0)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());

      System.out.println(result);
    }
}
