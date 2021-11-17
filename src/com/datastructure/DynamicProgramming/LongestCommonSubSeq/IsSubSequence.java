package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

import java.util.Arrays;

public class IsSubSequence {
    public static void main(String[] args) {

        String s = "", t = "ahbgdc";
        isSubsequence(s,t);

    }

    //! short solution
// !-----------------------------------------------------

    static boolean isSubSequence(String s, String t) {
        int j = 0;
        for(int i=0; i<t.length() && j<s.length(); i++){
            if(s.charAt(j) == t.charAt(i))  j++;
        }
        return j == s.length();
    }
//!-----------------------------------------------------
    static void isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if( n == 0) System.out.println("true");
        if(m == 0) System.out.println("false");
        if( n == 0  || m == 0) System.out.println("false");
        System.out.println(n + " " + m);
        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i <= n; ++i){
            for(int j = 0; j <= m; ++j){
                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 0;
            }
        }

        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= m; ++j){

                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }
        for (int[] val:dp    ) {
            System.out.println(Arrays.toString(val));
        }
        if (dp[n][m] != 0 && dp[n][m] == s.length())System.out.println(true);
        else System.out.println(false);
    }
}
