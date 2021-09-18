package com.datastructure.DynamicProgramming;

import java.util.Arrays;

public class SubSetSumProblem {
    public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        boolean ans = subSetCount(arr, arr.length, 40);
        System.out.println("Answer -> " + ans);
    }

    static boolean subSetCount(int[] arr, int n, int sum){

        boolean[][] dp = new boolean[n+1][sum+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1 ; j++) {
                if (i == 0){
                    dp[i][j] = false;
                }
                if (j == 0){
                    dp[i][j] = true;
                }

            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum ; j++) {
                if (arr[i-1] <= j){
                    dp[i][j] = dp[i][j-arr[i-1]] || dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }

            }
        }
        for (boolean[] val:dp ) {
            System.out.println(Arrays.toString(val));
        }

        return dp[n][sum];
    }


}
