package com.dsa.systemdesign.Arrays;

public class MaxElementInArrayinGivenRange {

    private static int max(int[] input,int start, int end) {

        if(end >start){
            return -1;
        }

        int max = input[start];

        for(int i = start; i<= end;i++){
            if(input[i] > max){
                max =  input[i];
            }
        }
    return max;
    }

    public static void main(String[] args) {

        int[] input = {10,20,11,200,5,7,101,22,134,0,123,700,987,456};

        System.out.println(max(input, 2, 13));
    }
}
