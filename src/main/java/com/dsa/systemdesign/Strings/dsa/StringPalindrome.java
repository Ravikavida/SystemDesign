package com.dsa.systemdesign.Strings.dsa;

public class StringPalindrome {

    public static boolean ispalinDrome(String s){

        if(s ==null || s.length() ==0 ){
            return true;
        }
        for(int i=0;i<= s.length()/2; i++){
            char start = s.charAt(i);
            char end   = s.charAt(s.length()-1-i);
            if(start != end){
                return false;
            }
        }
            return true;
    }

    public static void main(String[] args) {

        System.out.println(ispalinDrome("abcdcba"));
    }
}
