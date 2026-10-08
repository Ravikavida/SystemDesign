package com.dsa.systemdesign.linersearch.two.d;

public class MinValueIn2DArray {

    //using enhance for loop
    public static int minValue(int[][] input){

        int min = Integer.MAX_VALUE;
        for(int[] i : input){
            for(int k: i){
                if(k < min){
                    min = k;
                }
            }
        }
        return min;
    }

    //Using for Loop
    public static int minValue_1(int[][] input){

        int min = Integer.MAX_VALUE;
        for(int row =0;row <input.length;row++){
            for(int col =0; col < input[row].length;col++){
                if( input[row][col] < min){
                    min = input[row][col];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] input = {{12,34,45},{12,89},{78,65,23}};
        System.out.println(minValue(input));
        System.out.println(minValue_1(input));
    }
}
