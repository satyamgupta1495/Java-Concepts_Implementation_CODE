package com.hackerRank.problemSolving;

import java.util.*;

public class ParenthesisChecker {

    //! Stack problem

    boolean parenthesisChecker(String x){
        char[] string = x.toCharArray();
        Arrays.sort(string);
        for (char elem:string     ) {
            System.out.print(elem + " ");
        }
        int i ;
        for (i = 0; i < string.length; i = i+2)
            if (string[i] != string[i+1]) return false;

        return true;
    }

    public static void main(String[] args) {


        ParenthesisChecker check = new ParenthesisChecker();
        System.out.println(check.parenthesisChecker("([{}])"));



    }
}
