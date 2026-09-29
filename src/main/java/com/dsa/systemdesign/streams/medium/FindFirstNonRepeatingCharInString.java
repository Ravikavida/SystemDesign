package com.dsa.systemdesign.streams.medium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharInString {

    public static void main(String[] args) {

        String s = "hellowhworld";

       Map.Entry<Character, Long> ch = s.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(map -> map.getValue() ==1).findFirst().orElseThrow();

       System.out.println(ch);
    }
}
