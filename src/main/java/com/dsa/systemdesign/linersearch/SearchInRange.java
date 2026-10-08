package com.dsa.systemdesign.linersearch;

public class SearchInRange {

    public static int search(int[] arr, int start,int end, int target){

        if(start == end || arr.length ==0){
            return Integer.MAX_VALUE;
        }
        for(int index =start;index < end;index++){
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,100,90,18,17,36,36,774};

        int start =1;
        int end = 5;
        int target = 774;
        System.out.println(search(arr,start,end,target));
    }
}
