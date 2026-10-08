package com.dsa.systemdesign.linersearch.two.d;

import java.util.Arrays;

public class SearchIn2DArray {

    public static int[] findElement(int[][] input,int target){
        if(input.length == 0){
            return new int[]{-1,-1};
        }
        for(int row =0;row <input.length;row++){
            for(int col =0;col<input[row].length;col++){
                if(input[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int[][] input = {{12,34,45},{12,89},{78,65,23}};
        int taget = 78;

        int result[] = findElement(input,taget);
        System.out.println(Arrays.toString(result));
    }
}
