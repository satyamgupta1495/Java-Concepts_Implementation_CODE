package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

import java.util.*;

public class LCS6_LongestPalindromicMinDeletion {
    static int[][] dp = new int[1001][1001];

    public static void main(String[] args) {

        String S = "aebcbda";
        //? O/P -> 2   Remove characters 'e' and 'd'

        for(int[] val : dp){
            Arrays.fill(val,-1);
        }
        StringBuilder sb = new StringBuilder(S);
        int ans =  getSubstring(S,sb.reverse().toString(), S.length(), sb.length());

        System.out.println(S.length()-ans);
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
