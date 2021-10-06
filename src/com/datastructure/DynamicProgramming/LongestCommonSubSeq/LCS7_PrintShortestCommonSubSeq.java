package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LCS7_PrintShortestCommonSubSeq {
    public static void main(String[] args) {
        String X = "abac",  Y = "cab";
//        String X = "AGGTAB",  Y = "GXTXAYB";
//        String X = "geek", Y = "eke";
        getSubSeq(X,Y,X.length(),Y.length());
    }

    static void getSubSeq(String s1, String s2, int n , int m){
        int[][] dp = new int[n+1][m+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m ; j++) {
                if (i == 0) dp[i][j] = 0;
                if (j == 0) dp[i][j] = 0;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m ; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        for (int[] val:dp  ) {
            System.out.println(Arrays.toString(val));
        }


        StringBuilder sb1 = new StringBuilder();

        int i = n, j = m;

        while(i > 0 && j > 0){
            if (s1.charAt(i-1) == s2.charAt(j-1)){
                sb1.append(s1.charAt(i-1));
                i--;
                j--;
            }else{
                if (dp[i-1][j] > dp[i][j-1]){
                    sb1.append(s1.charAt(i-1));
                    i--;
                }else{
                    sb1.append(s2.charAt(j-1));
                    j--;
                }
            }
        }

        while( i > 0){
            sb1.append(s1.charAt(i-1));
            i--;
        }
        while( j > 0){
            sb1.append(s2.charAt(j-1));
            j--;
        }
        System.out.println(sb1.reverse().toString());
    }

}
