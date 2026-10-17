package com.dsa.systemdesign.cyclicsort;

public class FindSmallestMissingPositiveNumber {

    public static int findMissingPositive(int[] arr){

        int i =0;
        while(i< arr.length){
                int currentIndex = arr[i] - 1;
                if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[currentIndex]) {
                    swap(arr, i, currentIndex);
                }
            else{
                i++;
            }
        }
        for(int index =0;index< arr.length;index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length +1;
    }

    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] =  arr[last];
        arr[last] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {-1,1,3,4};
        int result = findMissingPositive(arr);
        System.out.println(result);
    }
}
