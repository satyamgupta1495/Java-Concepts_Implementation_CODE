package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

public class LCS8_WildCardPatternMatching {
    public static void main(String[] args) {
        String s = "aa", p = "*";
        if (s.length() > p.length() && !p.contains("*")) System.out.println(false);
        int lcs = getSubString(s, p, s.length(), p.length());
//        int len = Math.min(s.length(), p.length());

        if (lcs < p.length()) {
            System.out.println(true);
        }
        else System.out.println(false) ;
    }

    static int getSubString(String s1, String s2, int n, int m){
        int[][] dp = new int[n+1][m+1];
        int max = 0;

        for(int i = 0; i<= n; ++i){
            for(int j = 0; j <= m; ++j){
                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 0;
            }
        }

        for(int i = 1; i<= n; ++i){
            for(int j = 1; j <= m; ++j){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];

                }
                else{
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= m ; j++) {
                max = Math.max(max, dp[i][j]);

            }
        }


        return max;

    }
}
