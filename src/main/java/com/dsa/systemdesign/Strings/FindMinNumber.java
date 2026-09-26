package com.dsa.systemdesign.Strings;

public class FindMinNumber {
    public static void main(String[] args) {
        int arr[] = {80,20,19,40,70, -1,170};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
