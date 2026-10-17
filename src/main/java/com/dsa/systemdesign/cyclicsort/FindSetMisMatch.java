package com.dsa.systemdesign.cyclicsort;

import java.util.Arrays;

public class FindSetMisMatch {

    public static int[] findMissingSet(int arr[]){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        //find missingset
        for(int index =0;index<arr.length;index++){
            if(arr[index] != index +1){
                return new int[]{arr[index], index+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] =  arr[last];
        arr[last] = temp;

    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,4};
        int[] result =  findMissingSet(arr);
        System.out.println(Arrays.toString(result));
    }

}
