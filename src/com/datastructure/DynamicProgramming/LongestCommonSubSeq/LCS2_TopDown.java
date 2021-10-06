package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

public class LCS2_TopDown {
    public static void main(String[] args) {
        String s1 = "aggtab";
        String s2 = "gxtxayb";
        System.out.println(getSubSeq(s1,s2, s1.length(), s2.length()));
    }

    static int getSubSeq(String s1, String s2, int n, int m){
        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i <= n ; ++i) {
            for (int j = 0; j <= m ; ++j) {
                if (i == 0) dp[i][j] = 0;
                if (j == 0) dp[i][j] = 0;
            }
        }

        for (int i = 1; i <= n ; ++i) {
            for (int j = 1; j <= m ; ++j) {
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
}
