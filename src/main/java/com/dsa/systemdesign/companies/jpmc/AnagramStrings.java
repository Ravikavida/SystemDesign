package com.dsa.systemdesign.companies.jpmc;

import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {
    public static boolean isAnagram(String s1,String s2){

        if(s1.isEmpty() || s2.isEmpty() || s1.length() != s2.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char ch: s2.toCharArray()){

            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.get(ch)-1);

            if(map.get(ch) == 0){
                map.remove(ch);
            }

        }
        return map.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "army"; //listen
        String s2 = "mara";  //silent
        System.out.println(isAnagram(s1,s2));
    }
}
