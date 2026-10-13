package com.dsa.systemdesign.binarysearch;

public class FindSmallestLetterGreaterThanTargetLetter {

    public static char findSmallestGreaterThanTargetLetter(char[] character, char target){
        int start = 0;
        int end = character.length -1;

        while(start <= end){
            int mid = start+ (end-start)/2;

            if(target < character[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return character[start%character.length];
    }

    public static void main(String[] args) {

        char[] ch = {'c','f','j'};

        System.out.println(findSmallestGreaterThanTargetLetter(ch,'a'));
        System.out.println(findSmallestGreaterThanTargetLetter(ch,'c'));
    }
}
