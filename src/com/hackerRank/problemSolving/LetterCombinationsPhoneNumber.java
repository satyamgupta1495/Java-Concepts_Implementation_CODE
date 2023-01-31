package com.hackerRank.problemSolving;

//!   https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.*;

public class LetterCombinationsPhoneNumber {

    Map<String, String> map= new HashMap<>();

    public static void main(String[] args) {
        LetterCombinationsPhoneNumber lp = new LetterCombinationsPhoneNumber();

        int dig = '2' - '0';
        System.out.println(dig);
    }

    public void letterCombinations(String digits) {

        map.put("2" , "abc");
        map.put("3" , "def");
        map.put("4" , "ghi");
        map.put("5" , "jkl");
        map.put("6" , "mno");
        map.put("7" , "pqrs");
        map.put("8" , "tuv");
        map.put("9" , "wxyz");

        System.out.println(map);

    }

    static void printCombination(String str){

    }

//    static void permute(String s, String answer)
//    {
//        if (s.length() == 0)
//        {
//            System.out.print(answer + "  ");
//            return;
//        }
//
//        for(int i = 0 ;i < s.length(); i++)
//        {
//            char ch = s.charAt(i);
//            String left_substr = s.substring(0, i);
//            String right_substr = s.substring(i + 1);
//            String rest = left_substr + right_substr;
//            permute(rest, answer + ch);
//        }
//    }

}
