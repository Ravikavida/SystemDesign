package com.dsa.systemdesign.Strings;

public class FindLCDofNumber {

    public static int findLCM(int a, int b){
        int max = Math.max(a,b);
        while(true){
            if(max % a == 0 && max % b ==0){
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        System.out.println(findLCM(12, 18));
    }
}
