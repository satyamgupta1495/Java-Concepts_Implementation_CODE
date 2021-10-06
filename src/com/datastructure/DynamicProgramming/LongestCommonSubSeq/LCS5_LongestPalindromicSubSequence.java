package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

import java.util.Arrays;

public class LCS5_LongestPalindromicSubSequence {
    public static void main(String[] args) {
        String s1 = "abgcba";
        StringBuilder sb = new StringBuilder(s1);
        System.out.println(sb);
        int ans = LCS2_TopDown.getSubSeq(s1, sb.reverse().toString(), s1.length(), sb.length());
        System.out.println(s1.length()-ans);
        System.out.println(ans);
    }

    //! Recursive Approach

    static int[][] dp = new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        for(int[] val : dp){
            Arrays.fill(val,-1);
        }
        StringBuilder sb = new StringBuilder(s);
        return getSubstring(s,sb.reverse().toString(), s.length(), sb.length());
    }

    static int getSubstring(String s1, String s2, int n, int m){

        if(n == 0 || m == 0) return 0;

        if(dp[n][m] != -1) return dp[n][m];

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return dp[n][m] = 1 + getSubstring(s1, s2, n-1, m-1);
        }
        else{
            dp[n][m] = Math.max(getSubstring(s1,s2, n-1, m), getSubstring(s1, s2, n, m-1));
        }
        return dp[n][m];
    }
}
