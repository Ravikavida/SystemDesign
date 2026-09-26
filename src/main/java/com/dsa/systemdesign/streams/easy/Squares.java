package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class Squares {

    public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> result = numbers.stream().map(n -> n * n).toList();
    System.out.println(result);

    }
}
