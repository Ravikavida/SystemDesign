package com.dsa.systemdesign.Strings;

public class PowerOfNumber {
    public static int getPowerOfNumber(int base,int exponent){
        int result = 1;
        for(int i =0;i<exponent;i++){
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPowerOfNumber(2,6));
    }
}
