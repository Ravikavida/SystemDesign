package com.dsa.systemdesign.Strings;

public class PalinDromeNumber {


    public static boolean  checkNumber(int number){
        if(number <=9 && number >= -9){
            return true;
        }

        int original = number;
        int reversed = 0;
        while(number > 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        System.out.println(checkNumber(121));
        System.out.println(checkNumber(123));
        System.out.println(checkNumber(1221));
    }
}
