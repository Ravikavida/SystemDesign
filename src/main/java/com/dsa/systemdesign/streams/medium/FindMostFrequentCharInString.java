package com.dsa.systemdesign.streams.medium;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostFrequentCharInString {
    public static void main(String[] args) {

        String s= "banana";

        Map.Entry<Character,Long> value = s.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

        System.out.println(value);
    }
}
