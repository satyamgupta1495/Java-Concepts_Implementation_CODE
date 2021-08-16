package com.datastructure.DynamicProgramming;

public class KnapSackMemoization {

    static int knapSackRecursive(int[] wt, int[] val, int W, int n, int[][] dp)
    {
        if (n == 0 || W == 0) return 0;

        if (dp[n][W] != -1) return dp[n][W];

        if (wt[n-1] <= W){
            return dp[n][W] = Math.max(val[n-1]+knapSackRecursive(wt, val, W-wt[n-1], n-1, dp),knapSackRecursive(wt, val, W, n-1, dp));
        }
        else if (wt[n-1] > W) return dp[n][W] = knapSackRecursive(wt, val, W, n-1, dp);
        else return 0;

    }

    static int knapSack(int[] wt, int[] val, int W, int n)
    {
        int[][] dp = new int[n+1][W+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < W+1; j++) {
                dp[i][j]  = -1;
            }
        }

        return  knapSackRecursive(wt,val,W,n,dp);
    }

    public static void main(String[] args)
    {

        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        KnapSackMemoization sack = new KnapSackMemoization();
        int res = sack.knapSack(wt,val,W,n);
        System.out.println(res);
    }
}
