package com.datastructure;

import java.util.Arrays;

/*
Given a rod of length N inches and an array of prices,
price[] that contains prices of all pieces of size smaller than N.
Determine the maximum value obtainable by cutting up the rod and selling the pieces.

Input:
N = 8
Price[] = {1, 5, 8, 9, 10, 17, 17, 20}
Output:
22
Explanation:
The maximum obtainable value is 22 by
cutting in two pieces of lengths 2 and
6, i.e., 5+17=22.
 */

public class UB4_RodCutting2 {

    public static void main(String[] args) {
        int n = 8;
        int[] wt = new int[n];
        for (int i = 0; i < n ; i++) {
            wt[i] = i+1;
        }

//        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};  //! -> 22
        int[] price = {3, 5, 8, 9, 10, 17, 17, 20};  //! -> 24
        int[][] dp = new int[n+1][n+1];
        for (int[] val:dp ) Arrays.fill(val,-1);
        int ans = cutRod(price,wt,wt.length,n,dp);
        System.out.println(ans);
    }

    static int cutRod(int[] price,int[] wt, int n, int W, int[][] dp){
        if(n == 0 || W == 0) return dp[n][W] = 0;
        if (dp[n][W] != -1) return dp[n][W];
        if(wt[n-1] <= W){
            return dp[n][W] = Math.max(price[n-1] + cutRod(price, wt, n,W-wt[n-1], dp),cutRod(price, wt, n-1,W, dp));
        }else{
            return dp[n][W] = cutRod(price, wt, n-1,W, dp);
        }
    }


}
