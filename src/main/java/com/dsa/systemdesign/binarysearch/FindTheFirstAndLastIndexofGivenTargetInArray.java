package com.dsa.systemdesign.binarysearch;

import java.util.Arrays;

public class FindTheFirstAndLastIndexofGivenTargetInArray {

    public static int[] findIndexes(int[] arr,int target){

        int[] result = {-1,-1};
        int startIndex = returnIndex(arr,target,true);
        int endIndex = returnIndex(arr,target,false);
        result[0] = startIndex;
        result[1] = endIndex;
        return result;
    }

    public static int returnIndex(int[] arr,int target,boolean firstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end-start)/2;
             if(target < arr[mid]){
                 end = mid -1;
             }else if(target> arr[mid]){
                 start = mid +1;
             }else{
                 ans = mid;
                 if(firstIndex){
                     end = mid -1;
                 }else{
                     start = mid + 1;
                 }
             }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7; //[1,4]
        System.out.println(Arrays.toString(findIndexes(arr,target)));
    }
}
