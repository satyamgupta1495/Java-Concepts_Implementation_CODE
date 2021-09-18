package com.hackerRank.problemSolving;

import java.util.*;
public class StringtoInteger {

    static int myAtoi(String str) {
        int i = 0;
        int sign = 1;

        // Skip WhiteSpaces
        while(i < str.length() && str.charAt(i) == ' '){
            ++i;
        }

        //! IMP
        if(i > str.length()) return 0;

        //Sign
        if (str.charAt(i) == '-' || str.charAt(i) == '+'){
            sign = str.charAt(++i) == '+' ? 1 : -1;
        }

        long res = 0;
        while(i < str.length() && Character.isDigit(str.charAt(i))){
            res = res * 10 + (str.charAt(i++) - '0');
            if(res * sign > Integer.MAX_VALUE || res * sign  < Integer.MIN_VALUE){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        return (int) res * sign;
    }

    public static void main(String[] args) {
//        char str[] = "words and   -7123".toCharArray();
        String str = "-4193 with words";
        System.out.println(myAtoi(str));
    }
}
