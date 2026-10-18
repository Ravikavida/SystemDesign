package com.dsa.systemdesign.pattrens;

public class Pattren_6 {

    public static void pattren_6(int n){
        for(int row =0;row<2*n;row++){
            int totalColsInRow = row > n ? 2*n -row:row;
            int numOfspaces = n-totalColsInRow;
            for(int space =0; space < numOfspaces;space++){
            System.out.print(" ");
            }
            for(int col =0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattren_6(6);
    }
}
