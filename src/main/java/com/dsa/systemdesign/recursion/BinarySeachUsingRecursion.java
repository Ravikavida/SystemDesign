package com.dsa.systemdesign.recursion;

public class BinarySeachUsingRecursion {

    public static int findGivenElement(int[] arr, int target,int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target< arr[mid]){
           return findGivenElement(arr,target,s,mid-1);
        }else{
            return findGivenElement(arr,target,mid+1 ,e);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        int target = 66;
        System.out.println(findGivenElement(arr,target,0,arr.length-1));

    }
}
