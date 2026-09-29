package com.dsa.systemdesign.streams.hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AverageOfeveryThreeIntegersSlidingWindow {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(3,4,5,6,7,8,9);

        int window = 3;

        List<Double> result = IntStream.range(0,(input.size()-(window-1))).mapToObj(i -> input.subList(i,i+window))
                .map(w ->w.stream().mapToInt(Integer::intValue).average().orElse(0.0)).toList();

System.out.println(result);


    }
}
