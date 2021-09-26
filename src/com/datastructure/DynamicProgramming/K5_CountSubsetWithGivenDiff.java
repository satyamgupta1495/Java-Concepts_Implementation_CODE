package com.datastructure.DynamicProgramming;

public class K5_CountSubsetWithGivenDiff {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,1};

        int ans = getSubSetWithSameDiff(arr, 1);
        System.out.println(ans);
    }

    /*
        [1,1,2,3] -> 3
        s1 - s2 = diff  -----(1)
        s1 + s2 = sum   -----(2)
       -----------------------------
       2s1 = diff + sum
            i.e
       s1 = (diff + sum ) / 2
    */

    static int getSubSetWithSameDiff(int[] arr, int diff){
        int sum = 0;
        for (int val : arr){
            sum += val;
        }

        if (arr.length < 2 && diff > sum) return 0;


        int subsetSum = (diff+sum) / 2;
        int ans = countSubset(arr, arr.length, subsetSum);
        return ans;

    }

    static int countSubset(int[] arr,int n, int sum){
        int[][] dp = new int[n+1][sum+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum ; j++) {
                if (i == 0) dp[i][j] = 0;
                if (j == 0) dp[i][j] = 1;
            }
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= sum ; j++) {
                if (arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][sum];
    }
}
