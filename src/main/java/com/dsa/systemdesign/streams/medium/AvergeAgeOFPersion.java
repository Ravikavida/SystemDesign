package com.dsa.systemdesign.streams.medium;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvergeAgeOFPersion {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person(20,"abc"),
                new Person(25,"klm"),
                new Person(30,"xyz"));

        double avg = personList.stream().mapToInt(Person::getAge).average().orElse(0.0);
        System.out.println(avg);
    }
}
