package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//with No sort
public class FindFirstGreaterNumberTen {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,8,9,100,10,20,11);

        Integer result_withnoSort = numbers.stream().filter( n->n>10).findFirst().orElseThrow();

        System.out.println(result_withnoSort);

        //after sort

        Integer result_withSort = numbers.stream().sorted().filter(n->n>10).findFirst().orElseThrow();

        System.out.println(result_withSort);


    }
}
