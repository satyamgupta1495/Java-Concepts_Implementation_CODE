package com.hackerRank.problemSolving;

public class UniquePath {
    public static void main(String[] args) {

        int m = 3, n = 2;
        int[][] dp = new int[m+1][n+1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] += dp[i-1][j] + dp[i][j-1];

                }

            }
        }
        System.out.println(dp[m][n]);

    }
}
