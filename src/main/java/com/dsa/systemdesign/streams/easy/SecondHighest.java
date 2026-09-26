package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {

    public static void main(String[] args) {
        int[] arr = {10,11,9,12,15,14,13};

        int seconde_high = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();

        System.out.println(seconde_high);

    }
}
