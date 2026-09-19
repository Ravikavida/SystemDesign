package com.dsa.systemdesign.Strings;

public class PlainDromeString {

    //Using two pointer
    public static boolean palinUsingTwoPointer(String input){
        if(input.length() == 1){
            return true;
        }
        char[] ch = input.toCharArray();
        int left = 0;
        int right = input.length()-1;

        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left ++;
            right--;
        }
        return input.equals(new String(ch));
    }

    //using String Builder with no build in method reverse()
    public static boolean palinUsingStringBuilder(String input){
        if(input.length() == 1){
            return true;
        }
       StringBuilder builder = new StringBuilder();
        for(int i = input.length()-1; i>=0; i--){
            builder.append(input.charAt(i));
        }
        return input.equalsIgnoreCase(builder.toString());
    }

    public static void main(String[] args) {
        System.out.println(palinUsingTwoPointer("madam"));
        System.out.println(palinUsingTwoPointer("car"));
        System.out.println(palinUsingTwoPointer("b"));

        System.out.println(palinUsingStringBuilder("madam"));
        System.out.println(palinUsingStringBuilder("car"));
        System.out.println(palinUsingStringBuilder("a"));
    }
}
