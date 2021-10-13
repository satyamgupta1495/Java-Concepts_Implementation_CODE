package com.datastructure.DynamicProgramming;

import java.util.Arrays;

public class subsetDemo {
    public static void main(String[] args) {
        int array[] = {3, 34, 4, 12, 5, 2};
//        int array[] = {1,2,7};
        boolean ans = subset(array, 9);
        int ans1 = countset(array, array.length, 10);
        System.out.println(ans1);
        System.out.println("Answer -> " + ans);
    }

    static boolean subset(int[] arr, int sum){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        //! initialization
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= sum ; j++) {
                if (i == 0) dp[i][j] = false;
                if (j == 0) dp[i][j] = true;
            }
        }

        //! storing
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= sum ; j++) {
                if (arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for (boolean[] val: dp  ) {
            System.out.println(Arrays.toString(val));
        }
        return dp[n][sum];
    }
    static int countset(int[] arr, int n,int sum){
        int[][] dp = new int[n+1][sum+1];

        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= sum ; ++j) {
                if (i == 0) dp[i][j] = 0;
                if (j == 0) dp[i][j] = 1;
            }
        }

        for (int i = 1; i <= n ; ++i) {
            for (int j = 1; j <= sum ; ++j) {
                if (arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println();
        for (int[] val: dp  ) {
            System.out.println(Arrays.toString(val));
        }


        return dp[n][sum];

    }

}
