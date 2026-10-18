package com.dsa.systemdesign.Strings.dsa;

import java.util.ArrayList;

public class StringDemo {

    public static void main(String[] args) {

        String a = "Ravi";
        System.out.println(a); //Ravi
        a = "kumar";
        System.out.println(a); //kumar

        //comparison
        String b = "Ravi";
        String c = "Ravi";
        System.out.println(b == c);
        System.out.println('a');//a
        System.out.println('a' + 'b'); //195  asci value 97,98
        System.out.println('A');  //A
        System.out.println('A' +'B');  //131 65,66
        //System.out.printf("formating %.3f",Math.PI);

        //System.out.println(new Integer(10) + new ArrayList<>());

        String s = "    kumar   ";
        System.out.println(s.trim()); //legarcy unicodes u+0020 like that
        System.out.println(s.strip()); //latest in java 11  check Character.isWhitespace() and then removes the spaces
        System.out.println(s.stripLeading()); // removes only leading spaces
        System.out.println(s.stripTrailing()); // removes only trailing spaces
    }
}
