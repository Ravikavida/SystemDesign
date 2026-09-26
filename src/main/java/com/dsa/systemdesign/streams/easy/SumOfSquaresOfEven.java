package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEven {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,5,8,9,100,10,20,11);

        Integer result = numbers.stream().filter( n-> n%2 ==0).map(n -> n*n).reduce(0,Integer::sum);

        System.out.println(result);
    }
}
