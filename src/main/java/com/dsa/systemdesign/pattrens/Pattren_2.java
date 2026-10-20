package com.dsa.systemdesign.pattrens;

public class Pattren_2 {

    public static void pattren_2(int n){

        for(int row =1;row<=n;row++){
            for(int col =1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren_2(5);
    }
}
