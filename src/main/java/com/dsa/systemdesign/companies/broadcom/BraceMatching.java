package com.dsa.systemdesign.companies.broadcom;

import java.util.Stack;

public class BraceMatching {

    public static boolean isValidPattren(String pattren){

        if(pattren.isEmpty()){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char ch: pattren.toCharArray()){

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }else if(ch == '}' || ch == ']' || ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                char openChar = stack.pop();
                if((ch == '}' && openChar != '{') || (ch == ']' && openChar != '[') ||
                        (ch == ')' && openChar != '(') ){

                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        System.out.println(isValidPattren("{[()]}"));
        System.out.println(isValidPattren("{[(ab)a]x}"));
        System.out.println(isValidPattren("{[())]}"));

    }
}
