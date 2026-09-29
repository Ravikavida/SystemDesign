package com.dsa.systemdesign.streams.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

//Ignore and punctuations
public class FindLongestWordInSentance {
    public static void main(String[] args) {
        String input = "hellow world how are you, how younnnn doing!";

        Optional<String> result = Arrays.stream(input.toLowerCase().replaceAll("[^a-z\\s]","").split(" "))
                .max(Comparator.comparing(String::length));

        System.out.println(result);


    }
}
