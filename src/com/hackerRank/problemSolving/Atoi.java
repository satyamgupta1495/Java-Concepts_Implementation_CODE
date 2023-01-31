package com.hackerRank.problemSolving;

public class Atoi {

    public static void main(String[] args) {

        String s = "     42";
        int res = myAtoi(s);
        System.out.println(res);

    }

    static int myAtoi(String s)
    {
        int sign = 1;
        int i = 0;

        while (i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        if (i > s.length()) return 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-'){
            sign = s.charAt(i++) == '+' ? 1 : -1;
//            System.out.println(sign);
//            System.out.println(s.charAt(i++));
        }

        long res = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))){
            res = res * 10 + (s.charAt(i++) - '0');
            if (res * sign > Integer.MAX_VALUE || res * sign < Integer.MIN_VALUE){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        return (int) (res*sign);

    }

}
