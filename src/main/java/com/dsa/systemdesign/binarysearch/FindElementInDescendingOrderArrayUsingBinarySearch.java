package com.dsa.systemdesign.binarysearch;


//Descending order arry
public class FindElementInDescendingOrderArrayUsingBinarySearch {

    public static int findElementInDescendingOrderArrayUsingBinarySearch(int[] arr, int target){

        int start =0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                end = mid -1;
            }else if(target < arr[mid]){
                start = mid +1;
            }else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {94,92,56,45,43,42,40,38,33,24,22,20,19,17,15,11,9,5,4,3,2};

        System.out.println(findElementInDescendingOrderArrayUsingBinarySearch(arr,33));
    }
}
