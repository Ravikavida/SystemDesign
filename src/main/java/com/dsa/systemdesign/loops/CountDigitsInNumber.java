package com.dsa.systemdesign.loops;

//count how many 5's in digit
public class CountDigitsInNumber {

    public static void main(String[] args) {

        int num = 455536;

        int count = 0;

        while(num >0){
            int digit = num %10;
            if(digit == 5){
                count ++;
            }
            num = num/10;
        }
System.out.println(count);
    }
}
