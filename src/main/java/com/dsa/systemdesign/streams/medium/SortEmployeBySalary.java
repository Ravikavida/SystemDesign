package com.dsa.systemdesign.streams.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeBySalary {
    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(10, "Ravi", 10000.00,null),
                new Employee(11, "teja", 20000.00,null),
                new Employee(12, "balaya", 70000.00,null),
                new Employee(13, "kumar", 60000.00,null),
                new Employee(14, "Ravi", 25000.00,null));

        List<Employee> afterSort = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(afterSort);

        //reverse arder
        List<Employee> desc = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(desc);
    }
}
