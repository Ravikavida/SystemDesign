package com.dsa.systemdesign.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbersInGivenArray {

    public static List<Integer> findNumbers(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        //just find missing number
        List<Integer> ans = new ArrayList<>();
       for(int index =0;index<arr.length;index++){
           if(arr[index] != index+1){
               ans.add(index+1);
           }
       }
            return ans;
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findNumbers(arr);
        System.out.println(ans);
    }

}
