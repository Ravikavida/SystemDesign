package com.dsa.systemdesign.recursion;

public class FibnociOfGivenNumber {

    public static int fiboOfGivenNumber(int n){

        if(n <2){
           return n;
        }
    return fiboOfGivenNumber(n-1) + fiboOfGivenNumber(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fiboOfGivenNumber(9));
    }
}
