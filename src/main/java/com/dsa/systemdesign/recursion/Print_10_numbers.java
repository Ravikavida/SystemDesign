package com.dsa.systemdesign.recursion;

public class Print_10_numbers {

    public static void print(int n){
        if(n ==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args) {
        print(1);
    }
}
