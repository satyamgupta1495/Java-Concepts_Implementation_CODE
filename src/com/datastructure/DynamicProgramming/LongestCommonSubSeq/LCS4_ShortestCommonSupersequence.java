package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

public class LCS4_ShortestCommonSupersequence {
    public static void main(String[] args) {
        String X = "abcd", Y = "xycd";
        System.out.println((X.length() + Y.length()-LCS2_TopDown.getSubSeq(X,Y,X.length(),Y.length())));
    }
}
