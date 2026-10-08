package com.dsa.systemdesign.binarysearch;

//if Array is in ascending order
public class FindElementUsingBinarySearch {

    public static int findTargetElementBinarySearch(int[] arr, int target){

        int start =0;
        int end = arr.length -1;

        while(start <= end ){

            //int mid = (start + end)/2;
            int mid = start + (end -start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }

        }
            return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,5,6,8,9,10,45,56,78,79,89,90,91,92,94};

        System.out.println(findTargetElementBinarySearch(arr,8));
    }
}
