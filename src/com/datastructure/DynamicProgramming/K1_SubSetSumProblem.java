package com.datastructure.DynamicProgramming;

import java.util.Arrays;

public class K1_SubSetSumProblem {
    public static void main(String[] args) {
        int array[] = {3, 34, 4, 12, 5, 2};
        boolean ans = subSet(array.length, array, 30);
        System.out.println("Answer -> " + ans);
    }

    public static boolean subSet(int N, int[] arr, int sum){

        boolean[][] dp = new boolean[N+1][sum+1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= sum ; j++) {
                if (i == 0) dp[i][j] = false;
                if (j == 0) dp[i][j] = true;
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum ; j++) {
                if (arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][sum];


    }





}
