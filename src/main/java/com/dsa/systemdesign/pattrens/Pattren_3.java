package com.dsa.systemdesign.pattrens;

public class Pattren_3 {

    public static void pattren_3(int n){

        for(int row =1;row<=n;row++){
            for(int col =1;col <=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattren_3(5);
    }
}
