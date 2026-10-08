package com.dsa.systemdesign.linersearch.two.d;

public class MaxWealth {


    public static int maxWealth(int[][] input) {

        int ans =Integer.MIN_VALUE;
        for(int row =0;row <input.length;row++){
            int sum =0;
            for(int col =0;col<input[row].length;col++){
                sum = sum + input[row][col];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        int[][] input = {{12,34,45},{12,89},{78,65,23}}; // 91,101,166  output =166

        System.out.println(maxWealth(input));
    }
}
