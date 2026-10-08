package com.dsa.systemdesign.linersearch;

public class LinerSearchDemo {

    public static int findAnElement(int[] arr,int targetElement){

        if(arr.length == 0){
            return -1;
        }
        for(int index= 0; index < arr.length;index++){
            if(arr[index] == targetElement){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,10,24,11,39,18};
        System.out.println(findAnElement(arr,110));

    }
}
