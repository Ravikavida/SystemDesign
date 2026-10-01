package com.dsa.systemdesign.loops;

public class Calculator {

    public static void main(String[] args) {
        char ch = ' ';//get it dynamically
        int result = 0;


        while(true){
            if(ch == '+' ||ch == '*'||ch == '-'||ch == '/'||ch == '%'){

                int num1 = 3;
                int num2 = 2;
                if(ch == '+'){
                  result = num1+num2;
                }
                if(ch == '-'){
                    result = num1-num2;
                }
                if(ch == '*'){
                    result = num1*num2;
                }
                if(ch == '/'){
                    if(num2 !=0){
                        result = num1/num2;
                    }
                }
                if(ch == '%'){
                    if(num2 !=0){
                        result = num1%num2;
                    }
                }else if(ch =='x' || ch =='X'){
                    break;
                }else{
                    System.out.println("invalid op");
                }
            }
        }
        System.out.println(result);
    }
}
