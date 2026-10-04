package com.dsa.systemdesign.Arrays;


import java.util.Arrays;

//int arr[][] = new int[r][c];
//arr lenth mean always row size int arr[][] = new int[3][0];  means here 3 is the length
//row size is always mandatory in 2d array coulmn is optional.
public class TwoD_ArrayDemo {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},
                {2,4},
                {6,7,8,9}};

        for(int row =0;row < arr.length;row ++){
            for(int col =0;col < arr[row].length;col ++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
       // other way to print

       for(int row =0; row <arr.length;row++) {
           System.out.println(Arrays.toString(arr[row]));
       }
    }
}
