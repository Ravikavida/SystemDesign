package com.dsa.systemdesign.sorts.bobblesort;

import java.util.Arrays;

public class BobbleSortDemo {

    public static void bobbleSort(int[] arr){

        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j =1; j< arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,7,9,0,-2};
        bobbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
