package com.dsa.systemdesign.streams.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheOccurenceOfEachElementInList {

    public static void main(String[] args) {

        List<String> wordsList = Arrays.asList("bat","cat","four","five","hello","world","hello","bat","cat");

        Map<String,Long> occurent = wordsList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(occurent);
    }
}
