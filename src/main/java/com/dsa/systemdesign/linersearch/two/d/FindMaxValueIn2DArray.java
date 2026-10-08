package com.dsa.systemdesign.linersearch.two.d;

public class FindMaxValueIn2DArray {


    //using enhance for loop
    public static int maxValue(int[][] input){

        int max = Integer.MIN_VALUE;
        for(int[] i : input){
            for(int k: i){
                if(k > max){
                    max = k;
                }
            }
        }
        return max;
    }

    //Using for Loop

    public static int maxValue_1(int[][] input){

        int max = Integer.MIN_VALUE;
        for(int row =0;row <input.length;row++){
            for(int col =0; col < input[row].length;col++){
                if(max < input[row][col]){
                    max = input[row][col];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] input = {{12,34,45},{12,89},{78,65,23}};
        System.out.println(maxValue(input));
        System.out.println(maxValue_1(input));
    }
}
