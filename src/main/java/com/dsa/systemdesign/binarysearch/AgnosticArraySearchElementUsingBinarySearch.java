package com.dsa.systemdesign.binarysearch;

public class AgnosticArraySearchElementUsingBinarySearch {

    public static int searchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
                int mid =    start + (end-start)/2;
                if(arr[mid] == target){
                 return mid;
                    }
                 if(isAsc){
                     if(target < arr[mid]){
                       end = mid -1;
                     }else{
                         start = mid +1;
                     }
                 }else{
                    if(target > arr[mid]){
                        end = mid-1;
                    }else{
                        start = mid +1;
                    }
                 }
             }
             return -1;
    }

    public static void main(String args[]){
        int[] arr = {94,92,56,45,43,42,40,38,33,24,22,20,19,17,15,11,9,5,4,3,2};
        int[] arr_asc = {2,3,5,6,8,9,10,45,56,78,79,89,90,91,92,94};

        System.out.println(searchElement(arr,40));
    }
}
