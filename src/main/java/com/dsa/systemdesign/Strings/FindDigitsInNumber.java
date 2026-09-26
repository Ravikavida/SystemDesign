package com.dsa.systemdesign.Strings;

public class FindDigitsInNumber {

    public static int findDigites(int number){
        if(number ==0){
            return 1;
        }
        int count =0;
        while(number > 0){
            number = number / 10;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(findDigites(1234));
        //System.out.println(String.valueOf(10001).length());
    }
}
