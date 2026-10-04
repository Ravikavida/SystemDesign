package com.dsa.systemdesign.Arrays;

public class MaxValueInArray {

    private static int max(int[] input) {

        int max = input[0];
        for(int i :input){
            if(i> max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] input = {10,20,11,200,5,7,101,22,134};

        System.out.println(max(input));
    }


}
