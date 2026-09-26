package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class StartWithGivenChar {
    public static void main(String[] args) {

        String[] fruits = {"apple","banana","avacado","grape","orange"};


        List<String> result = Arrays.stream(fruits).filter(fr -> fr.startsWith("a")).toList();

        //filter and count

        Long resultwithCount = Arrays.stream(fruits).filter(fr -> fr.startsWith("a")).count();

        System.out.println(result +" "+resultwithCount);

    }
}
