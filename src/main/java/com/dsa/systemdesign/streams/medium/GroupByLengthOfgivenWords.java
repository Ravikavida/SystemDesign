package com.dsa.systemdesign.streams.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLengthOfgivenWords {
    public static void main(String[] args) {

        List<String> wordsList = Arrays.asList("bat","cat","four","five","hello","world");

    Map<Integer,List<String>> result    =  wordsList.stream().collect(Collectors.groupingBy(String::length));

    System.out.println(result);



    }
}
