package com.datastructure.DynamicProgramming;

import com.satyamgupta.Array;

import java.util.Arrays;

public class K4_MinimumSubSetDiff {
    public static void main(String[] args) {
//        int[] arr = {2,1,0,4,2,9}; 0
        int[] arr = {1,4};
//        int[] arr = {3,7,9,3};
//        int[] arr = {-36, 36};

        int ans = minDifference(arr,arr.length);
        System.out.println(ans);
    }

    static int minDifference(int arr[], int n)
    {
        int mn = Integer.MAX_VALUE;
        int range = 0;
        for(int val : arr){
            range += val;
        }

        boolean minarr[] = getSubset(arr, n, range);

        int[] tempArr = new int[minarr.length];
        int x = 0;

        for(int i = 0; i <= minarr.length/2; ++i){
            if(minarr[i] == true){
                tempArr[x] = i;
                x++;
            }
        }

        for(int i = 0; i<tempArr.length; ++i){
            mn = Math.min(mn, range-2*tempArr[i]);
        }

        return mn;

    }

    static boolean[] getSubset(int[] arr,int n, int sum){
        boolean[][] dp = new boolean[n+1][sum+1];

        for(int i = 0; i <= n; ++i){
            for(int j = 0; j <= sum; ++j){
                if(i == 0) dp[i][j] = false;
                if(j == 0) dp[i][j] = true;
            }
        }

        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= sum; ++j){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }


        boolean[] newarr = new boolean[sum];
        for(int i = 0; i < sum; ++i){
            newarr[i] = dp[n][i];
        }

        return newarr;
    }
}
