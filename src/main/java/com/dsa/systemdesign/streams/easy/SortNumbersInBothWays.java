package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbersInBothWays {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 9, 2, 10, 2, 3, 0, 3, 36, 7, 8);

        List<Integer> asc = numbers.stream().sorted().toList();

        List<Integer> desc = numbers.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(asc);
        System.out.println(desc);
    }
}
