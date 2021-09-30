package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

import java.util.Arrays;

public class LCS1_Recurssive {
    static int[][] dp = new int[1001][1001];
    public static void main(String[] args) {

        //? initializing dp[][] matrix
        for (int[] val: dp ) {
            Arrays.fill(val,-1);
        }

        String s1 = "aggtab";
        String s2 = "gxtxayb";
        System.out.println(getSubSeq(s1,s2, s1.length(), s2.length()));

    }

    //! Recursive Approach
//    static int getSubSeq(String str1, String str2, int n, int m){
//        if (n == 0 || m == 0) return 0;
//
//        if (str1.charAt(n-1) == str2.charAt(m-1)){
//            return 1+getSubSeq(str1,str2, n-1,m-1);
//        }else{
//            return Math.max(getSubSeq(str1,str2, n-1, m), getSubSeq(str1, str2, n,m-1));
//        }
//    }

    //! Memoized Approach
    static int getSubSeq(String str1, String str2, int n, int m){
        if (n == 0 || m == 0) return 0;

        if (dp[n][m] != -1) return dp[n][m];
        if (str1.charAt(n-1) == str2.charAt(m-1)){
            return dp[n][m] = 1+getSubSeq(str1,str2, n-1,m-1);
        }else{
            return dp[n][m] = Math.max(getSubSeq(str1,str2, n-1, m), getSubSeq(str1, str2, n,m-1));
        }
    }
}
