package com.dsa.systemdesign.Arrays;

import java.util.Arrays;

//Two pointer way of reverse and Array.
public class ReverseAnArrayWithoutForLoop {

    public static void reverseAnArray(int[] input,int start, int end){
        while(start<end){
            swap(input,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] input,int start, int end){
        int temp = input[start];
        input[start] = input[end];
        input[end] = temp;
    }
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7,8};
        int start =0;
        int end = arr.length-1;
       reverseAnArray(arr,start,end);
       System.out.println(Arrays.toString(arr));
    }
}
