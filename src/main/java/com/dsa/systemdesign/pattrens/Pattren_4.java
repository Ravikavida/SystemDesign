package com.dsa.systemdesign.pattrens;

public class Pattren_4 {

    public static void pattren_4(int n){
        for(int row =1;row <=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }

    }

    public static void pattren_4_v2(int n){
        for(int row =1;row <=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(row +" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattren_4(5);

        pattren_4_v2(5);
    }
}
