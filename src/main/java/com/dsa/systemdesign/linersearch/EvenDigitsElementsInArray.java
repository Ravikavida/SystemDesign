package com.dsa.systemdesign.linersearch;

public class EvenDigitsElementsInArray {

    public static int findDigitsCountInNumber(int number){

        //if number negative
        if(number <0){
            number = number * -1;
        }
        if(number ==0){
            return 1;
        }

        int count =0;
        while(number > 0){
            count++;
            number = number/10;
        }
        return count;
    }

    public static boolean digitsCountIsEvenOrNot(int number){
        return findDigitsCountInNumber(number) %2 ==0;
    }

    public static int countOfEvendigitsNumberInArray(int[] arr){
        int result = 0;
        for(int i: arr){
            if(digitsCountIsEvenOrNot(i)) {
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[] arr = {12,1,3,4,12345,56,7890}; // 12,56,7890 so ans is 3.

        System.out.println(countOfEvendigitsNumberInArray(arr));
    }
}
