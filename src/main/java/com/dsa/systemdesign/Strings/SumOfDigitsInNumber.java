package com.dsa.systemdesign.Strings;

public class SumOfDigitsInNumber {

    public static int sumOfDigits(int number){

        int sum = 0;

        while(number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
