package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class CheckAllNumberGreater{

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,5,8,9,100,10,20,11);

        boolean result = numbers.stream().allMatch( n->n >0);

        System.out.println(result);

        //check all Even
        boolean result_1 = numbers.stream().allMatch( n->n %2 == 0);

        System.out.println(result_1);

        //check anyNumber devison by 3

        boolean result_2 = numbers.stream().anyMatch( n->n %3 == 0);

        System.out.println(result_2);
    }
}
