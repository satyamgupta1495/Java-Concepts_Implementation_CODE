package com.hackerRank.problemSolving;

//!   https://leetcode.com/problems/count-sorted-vowel-strings/

public class CountSortedVowelStrings {
    public static void main(String[] args) {
        String s = "satyam";
        System.out.println(isSorted(s));
    }


    static boolean isSorted(String s){
        boolean flg = false;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) < s.charAt(i+1)) flg = true;
            System.out.println(flg);
        }

        return flg;
    }
}
