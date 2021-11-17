package com.hackerRank.problemSolving;

//! https://leetcode.com/problems/reverse-words-in-a-string/

import java.util.*;

public class ReverseWordsString {
    public static void main(String[] args) {
//        String s = "a good   example";
        String s = "  Bob    Loves  Alice   ";
        reverseWords(s);
    }
    static void reverseWords(String s) {


        StringBuilder sb = new StringBuilder();

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.trim().replaceAll("  +", " ").split(" ")));

        Collections.reverse(list);

        for(String val : list){

            sb.append(val).append(" ");
        }
        System.out.println(list);

        System.out.println(sb.toString());



//        return finalString;
    }
}
