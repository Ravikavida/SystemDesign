package com.dsa.systemdesign.sorts.selectionsort;

import java.util.Arrays;



public class SelectionSortDemo {
    private static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++){
            int lastIndex = arr.length-i-1;
            int maxIndex = maxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    private static int maxIndex(int[] arr, int start, int lastIndex) {
        int max = start;
        for(int i=start;i<=lastIndex;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {3,4,2,1,7,9,0,-2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
