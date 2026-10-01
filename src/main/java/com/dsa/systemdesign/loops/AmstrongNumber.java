package com.dsa.systemdesign.loops;

public class AmstrongNumber {


    public static boolean isAmstrong(int number){

        int original = number;
        int sum =0;
        while(number > 0){
            int reminder = number % 10;
            number = number/10;
            sum = sum + (reminder * reminder * reminder);
        }
        return original == sum;
    }

    public static void main(String[] args) {
        System.out.println(isAmstrong(153));
    }
}
