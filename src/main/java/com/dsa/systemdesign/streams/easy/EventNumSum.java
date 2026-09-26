package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class EventNumSum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,8,9,100,10,20,11);

        Integer evensum = numbers.stream().filter(n-> n%2 ==0).reduce(0,Integer::sum);
        System.out.println(evensum);
    }
}
