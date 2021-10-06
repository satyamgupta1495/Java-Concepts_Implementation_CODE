package com.datastructure.DynamicProgramming.matrixchainmultiplication;

import java.util.Arrays;

public class PalindromePartitioningRecursive {

    static int[][] dp = new int[501][501];

    public static void main(String[] args) {

        for (int[] val:dp  ) {
            Arrays.fill(val,-1);
        }

        String s = "ababbbabbababa";
        System.out.println(solve(s,0,s.length()-1));
//        String s1 = "abcba";
//        System.out.println(isPalindrome(s,0,5));

    }

    static int solve(String s, int i, int j){

        if (i >= j) return 0;

        if (isPalindrome(s,i,j+1)) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j-1 ; ++k) {
            int temp = 1+solve(s,i,k) + solve(s,k+1,j);
            min = Math.min(min, temp);
        }
        return dp[i][j] = min;

    }

    private static boolean isPalindrome(String s, int i, int j) {

        // SatyamGupta

        StringBuilder sb = new StringBuilder(s.substring(i,j));
        String s1 = s.substring(i,j);
        return s1.equals(sb.reverse().toString());
    }
}
