package com.dsa.systemdesign.Strings;

public class FindAFactorialOfNumber {

    public static int factorialOfNumber(int num){
        if(num <= 0){
            return 0;
        }
        int result = 1;
        for( int i =1 ;i<=num ;i++){
            result = result * i;
        }
        return result;
    }

    public static int factorialUsingRecursion(int num){
        if(num ==0 || num ==1){
            return 1;
        }
        return num * factorialUsingRecursion(num-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialOfNumber(6));
        System.out.println(factorialUsingRecursion(6));
    }
}
