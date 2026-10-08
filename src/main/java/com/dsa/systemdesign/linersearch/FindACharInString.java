package com.dsa.systemdesign.linersearch;

public class FindACharInString {

    public static int search(String input,char ch){

        if(input.isEmpty()){
            return Integer.MAX_VALUE;
        }
        for(int i=0;i<input.length()-1;i++){
            if(ch == input.charAt(i)){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static boolean search_2(String input,char ch){

        if(input.isEmpty()){
            return false;
        }
        for(char c:input.toCharArray()){
            if(ch == c){
                return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String s = "abcdxyz";

        System.out.println(search(s,'c'));
        System.out.println(search_2(s,'k'));

    }
}
