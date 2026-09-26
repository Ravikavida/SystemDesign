package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNonEmptyStringInLisr {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("","hello","","xyz","abc",null);

        Optional<String> result = strings.stream().filter(word -> !word.isEmpty()).findFirst();

        System.out.println(result.get());


    }
}
