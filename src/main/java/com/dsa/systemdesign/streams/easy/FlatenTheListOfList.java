package com.dsa.systemdesign.streams.easy;

import java.util.Arrays;
import java.util.List;

public class FlatenTheListOfList {
    public static void main(String[] args) {

        List<List<Integer>>  list = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,9,7));

        List<Integer> singleList = list.stream().flatMap(List::stream).toList();

        System.out.println(singleList);

        //
    }
}
