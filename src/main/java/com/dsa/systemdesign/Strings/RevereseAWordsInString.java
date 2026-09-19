package com.dsa.systemdesign.Strings;

import java.util.Arrays;

public class RevereseAWordsInString {

    //To pointer approch
    public static String afterReverse(String input){

        String[] arr = input.split(" ");
        int left =0;
        int right = arr.length-1;

        while(left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.join(" ",arr).trim();
    }

    //using StringBuilder

    public static String usingStringBuilder(String input){
        StringBuilder sb = new StringBuilder();
        String[] arr = input.split(" ");
        for(int i = arr.length-1;i >=0 ;i--){
            sb = sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
       System.out.println(afterReverse("hello world how are you"));
        System.out.println(usingStringBuilder("hello world how are you"));
    }
}
