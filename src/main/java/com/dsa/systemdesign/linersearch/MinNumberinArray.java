package com.dsa.systemdesign.linersearch;

public class MinNumberinArray {

    public static int findMin(int[] arr){

        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
    return min;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,100,90,18,17,-2,36,36,774};

        System.out.println(findMin(arr));
    }
}
