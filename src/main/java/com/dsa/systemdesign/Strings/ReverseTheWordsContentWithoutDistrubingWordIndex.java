package com.dsa.systemdesign.Strings;

public class ReverseTheWordsContentWithoutDistrubingWordIndex {

    public static String reverseContentInWords(String input){

        String[] arr= input.split("\\s+");

        for(int i=0;i<arr.length;i++){
            char[] ch = arr[i].toCharArray();
            int left = 0;
            int right = ch.length-1;

            while(left < right){
                char temp = ch[left];
                ch[left] =  ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
            arr[i] = new String(ch);
        }
        return String.join(" ",arr).trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseContentInWords("hello world how are you"));
    }
}
