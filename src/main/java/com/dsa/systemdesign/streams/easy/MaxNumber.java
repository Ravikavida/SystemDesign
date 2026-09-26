package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,5,8,9,100,10,20,11);

        Integer max = numbers.stream().reduce(0,Integer::max);
        Integer max_1 = numbers.stream().reduce(0,(a,b) -> Integer.max(a,b));

        System.out.println(max);

    }
}
