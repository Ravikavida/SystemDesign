package com.dsa.systemdesign.streams.hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInStringUsingStream {
    public static void main(String[] args) {

        String s = "hello wolrd how are you";

        String result = Arrays.stream(s.split(" "))
                .map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining());

        System.out.println(result);

        //with no Predefined
        String result1 = Arrays.stream(s.split(" "))
                .map(word -> Arrays.stream(word.split("")).reduce("",(rev,ch) -> ch+rev)).collect(Collectors.joining());
    }
}
