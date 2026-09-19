package com.dsa.systemdesign.Strings;

public class StringReverseWays {

    //Using StringBuilder with no build in reverse()
    public static String reveresUsingStringBuilder(String input){

        StringBuilder sb = new StringBuilder();
        for(int i = input.length()-1;i>=0;i--){
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    //using two pointer
    public static String revereStringUsingtwoPointer(String input){
        char[] ch = input.toCharArray();
        int left =0;
        int right = input.length()-1;

        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

    //using for loop
    public static String usingforLoop(String input){
        String reverse = "";
        for(int i=input.length()-1;i>=0;i--){
            reverse = reverse+ input.charAt(i);

        }
        return reverse;
    }

    public static void main(String[] args) {
      System.out.println(StringReverseWays.reveresUsingStringBuilder("hello world"));
      System.out.println(StringReverseWays.revereStringUsingtwoPointer("hello world"));
        System.out.println(StringReverseWays.usingforLoop("hello world"));

    }
}
