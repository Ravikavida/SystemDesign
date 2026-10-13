package com.dsa.systemdesign.binarysearch;

//this is called bitonic Array
public class PeakElemetInMountainArray {

    public static int findPeakElement(int[] arr){
        int start =0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;
            //means we are in decreasing array part
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start; //you can written end also
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,6,4,3,2,1}; //prints index out put is index 5 means 6 is ans
        System.out.println(findPeakElement(arr));

    }
}
