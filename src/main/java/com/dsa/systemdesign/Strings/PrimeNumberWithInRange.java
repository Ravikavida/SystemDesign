package com.dsa.systemdesign.Strings;

public class PrimeNumberWithInRange {

    public static void PrimeNumbers(int num){

        if(num<=0){
            return;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num %2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrimeNumbers(20);
    }
}
