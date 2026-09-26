package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class DuplicatesRemove {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,2,2,2,3,3,3,36,7,8);

        List<Integer> result = numbers.stream().distinct().toList();
        System.out.println(result);
    }
}
