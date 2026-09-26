package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {

    public static void main(String[] args) {


    List<Integer> numbers = Arrays.asList(2,5,8,9,100,10,20,11);

    Integer sum = numbers.stream().reduce(0,Integer::sum);
        Integer sum1 = numbers.stream().reduce(0, (a,b)-> a + b);

        //product
        Integer product = numbers.stream().reduce(1, (a,b)-> a * b);
    System.out.println(sum);
        System.out.println(sum1);
        System.out.println(product);
    }
}
