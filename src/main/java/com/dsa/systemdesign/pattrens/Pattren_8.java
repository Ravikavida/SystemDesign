package com.dsa.systemdesign.pattrens;

public class Pattren_8 {

    public static void pattren_8(int n){

        n = 2*n;
        for(int row =0;row <= n ;row ++){
            for(int col =0;col <= n ;col ++){
            int everyIndex = Math.min(Math.min(row,col),Math.min(n-row,n-col));
            System.out.print(everyIndex +" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattren_8(6);
    }
}
