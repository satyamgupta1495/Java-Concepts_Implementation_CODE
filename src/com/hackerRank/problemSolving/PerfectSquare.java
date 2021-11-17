package com.hackerRank.problemSolving;

import java.util.Arrays;

class PerfectSquare {

    public static void main(String[] args) {
        int n = 12;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }
        for(int j = 1; j  <= n; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(dp));

        System.out.println(dp[n]);
    }

}