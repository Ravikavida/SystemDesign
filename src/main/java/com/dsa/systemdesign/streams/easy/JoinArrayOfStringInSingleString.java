package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinArrayOfStringInSingleString {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "avacado", "grape", "orange"};

        String result = Arrays.stream(fruits).collect(Collectors.joining(","));

        //enclose with []

        String result_1 = Arrays.stream(fruits).collect(Collectors.joining(",","[","]"));

        System.out.println(result);

        System.out.println(result_1);

    }
}
