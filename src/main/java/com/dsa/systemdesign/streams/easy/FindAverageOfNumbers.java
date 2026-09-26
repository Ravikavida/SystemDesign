package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverageOfNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 3, 36, 7, 8);
        Double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(average);
    }
}
