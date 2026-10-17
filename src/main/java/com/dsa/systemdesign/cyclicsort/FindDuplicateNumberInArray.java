package com.dsa.systemdesign.cyclicsort;

import java.util.List;

public class FindDuplicateNumberInArray {

    public static int findDuplicate(int[] arr){

        int i =0;
        while(i< arr.length){
            if(arr[i] != i+1) {
                int currentIndex = arr[i] - 1;
                if (arr[i] != arr[currentIndex]) {
                    swap(arr, i, currentIndex);
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] =  arr[last];
        arr[last] = temp;

    }
    public static void main(String[] args) {

        int[] arr = {1,3,4,2,2};
       int ans = findDuplicate(arr);
        System.out.println(ans);
    }
}
