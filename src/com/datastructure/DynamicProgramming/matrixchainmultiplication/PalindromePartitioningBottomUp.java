package com.datastructure.DynamicProgramming.matrixchainmultiplication;

//? https://www.geeksforgeeks.org/palindrome-partitioning-dp-17/

import java.util.Arrays;

public class PalindromePartitioningBottomUp {
    static int[][] dp = new int[501][501];

    public static void main(String[] args) {
        for (int[] val : dp) {
            Arrays.fill(val, -1);
        }

//        String s = "abcde"; -> 4
        String s = "ababbbabbababa";
        System.out.println(solve(s, 0, s.length() - 1));
//        String s1 = "abcba";
//        System.out.println(isPalindrome(s,0,5));


    }

    static int solve(String s, int i, int j) {

        if (i >= j) return 0;
        if (isPalindrome(s, i, j )) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int left = 0, right = 0;
        for (int k = i; k < j ; ++k) {
            int temp = 0;
            if (dp[i][k] != -1) left = dp[i][k];
            else {
                left = solve(s, i, k);
                dp[i][k] = left;
            }
            if (dp[k + 1][j] != -1) right = dp[k + 1][j];
            else {
                right = solve(s, k + 1, j);
                dp[k + 1][j] = right;
            }
        }
        return  1+left+right;
    }

    private static boolean isPalindrome(String s, int i, int j) {

        //! INTITUTIVE
        /*
        StringBuilder sb = new StringBuilder(s.substring(i,j));
        String s1 = s.substring(i,j);
        return s1.equals(sb.reverse().toString());
         */
        if (i == j) return true;
        if (i > j) return true;
        while( i < j){
            if (s.charAt(i) != s.charAt(j)) return false;
            ++i;
            --j;
        }

        return true;
    }


}






















