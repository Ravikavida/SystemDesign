package com.dsa.systemdesign.binarysearch;

public class CeilingOfNumber {

    //smallest number >= target
    public static int findCeilingOfGivenNumber(int[] arr,int target){

        if(arr.length == 0 || target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end- start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,5,5,9,14,16,18};
        System.out.println(findCeilingOfGivenNumber(arr,15));
    }
}
