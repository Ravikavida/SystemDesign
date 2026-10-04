package com.dsa.systemdesign.Arrays;

import java.util.Arrays;

public class SwapTheElementsInArrayBasedOnIndex {

    private static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {

        int[] arr = {10,4,7,9,2,10,11};
        swap(arr,3,4); //swapping 3rd and 4th index numbers

        System.out.println(Arrays.toString(arr));
    }


}
