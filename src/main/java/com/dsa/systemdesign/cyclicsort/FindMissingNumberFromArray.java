package com.dsa.systemdesign.cyclicsort;

import java.util.Arrays;

public class FindMissingNumberFromArray {

    public static int missingNumber(int[] arr){

        int i =0;
        while(i< arr.length){
            int correctIndex = arr[i];
            if(arr[i]< arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i,correctIndex);
            }else{
                i++;
            }
        }

        //search for element now
        for(int index =0;index<arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return  arr.length;
    }

    public static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {0,2,1,5,4};
        int result = missingNumber(arr);
        System.out.println(result);
    }

}
