package com.dsa.systemdesign.Strings;

public class FindGCDofNumbers {
    //greatest Common factor
    public static int getGCD(int a, int b){

      while(b != 0){
          int temp = b;
           b = a % b ;
           a = temp;
      }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(getGCD(45,10));
    }
}
