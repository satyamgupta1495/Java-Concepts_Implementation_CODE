package com.datastructure.DynamicProgramming;

import java.util.Arrays;

public class KnapSackMemoizationDemo {

   static int KnapSackReccur(int[] wt, int[] val, int W, int n, int[][] dp){
       if (W == 0 || n == 0) return 0;
       if (dp[n][W] != -1) return dp[n][W];
       if (W >= wt[n-1]){
           return dp[n][W] = Math.max(val[n-1]+ KnapSackReccur(wt, val, W -wt[n-1], n-1, dp), KnapSackReccur(wt, val, W, n-1, dp));
       }
       else{
           return dp[n][W] = KnapSackReccur(wt, val, W, n-1, dp);
       }

   }

   static int dpmemo(int[] wt, int[] val, int W, int n){
       int[][] dp = new int[n+1][W+1];
       for (int[] elem: dp) {
           Arrays.fill(elem,-1);
       }
       return KnapSackReccur(wt,val, W,n, dp);
   }

    public static void main(String[] args)
    {

        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        KnapSackMemoizationDemo sack = new KnapSackMemoizationDemo();
        int res = dpmemo(wt,val,W,n);
        System.out.println(res);
    }
}
