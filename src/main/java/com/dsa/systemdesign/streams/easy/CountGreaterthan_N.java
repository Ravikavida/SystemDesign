package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class CountGreaterthan_N {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,5,8,9,100,10,20,11);

        Long result = numbers.stream().filter( n->n>5).count();

        System.out.println(result);
    }
}
