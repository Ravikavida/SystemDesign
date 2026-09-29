package com.dsa.systemdesign.streams.hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheTopThreeMostFrequestWordsInParagrph {

    public static void main(String[] args) {

        String paragraph = "Hello i'm so and so and woking as solution architect in so and so company hello how are architect";

        List<Map.Entry<String, Long>> result = Arrays.stream(paragraph.toLowerCase().replaceAll("[^a-z\\s]", "").split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).limit(3).toList();

        System.out.println(result);
    }
}
