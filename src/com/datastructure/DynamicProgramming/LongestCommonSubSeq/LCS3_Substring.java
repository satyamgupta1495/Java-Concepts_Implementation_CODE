package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LCS3_Substring {
    static int[][] dp = new int[100][100];
    public static void main(String[] args) {
        String s1 = "ABCxxxDGH";
        String s2 = "ACDxxxGHR";
        int ans = getSubString(s1,s2, s1.length(), s2.length());
        System.out.println(ans);
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
        for(int[] val : dp){
            System.out.println(Arrays.toString(val));
        }

        //!Printing the SubString


        List<Character> list = new ArrayList<>();

        int i = n, j = m;
        while(i > 0 && j > 0){
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                list.add(s1.charAt(i-1));
                i--;
                j--;
            } else {
                if (dp[i-1][j] > dp[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        Collections.reverse(list);
        System.out.println(list);

        return max;

    }
}