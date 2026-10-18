package com.dsa.systemdesign.pattrens;

public class Pattren_1 {

    static void pattren1(int n){

        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattren1(5);
    }
}
