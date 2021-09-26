package com.datastructure.DynamicProgramming;

import com.satyamgupta.Array;

import java.util.Arrays;

public class K4_MinimumSubSetDiff {
    public static void main(String[] args) {
        int[] arr = {1,2,7};
        int ans = MinimumSubSetDiff(arr);
        System.out.println(ans);
    }

    static int MinimumSubSetDiff(int[] arr){

        int range = 0;
        for (int i = 0; i < arr.length; i++) {
            range += arr[i];
        }
        boolean[] bool = getSubset(arr, range);
//        System.out.println(Arrays.toString(bool));

        int[] newArr = new int[bool.length];
        int j = 0;
        for (int i = 0; i< bool.length/2; i++) {
            if (bool[i] == true) {
                newArr[j] = i;
                j++;
            }
        }
        int mn = Integer.MAX_VALUE;

        for (int i = 0; i < newArr.length; i++) {

            mn = Math.min(mn,range-2*newArr[i]);
        }
        return mn;

    }
    static boolean[] getSubset(int[] arr, int sum){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= sum ; ++j) {
                if (i == 0) dp[i][j] = false;
                if (j == 0) dp[i][j] = true;
            }
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= sum ; ++j) {
                if (arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        for (boolean[] val:dp ) {
            System.out.println(Arrays.toString(val));
        }

        System.out.println();
        boolean[] bool = new boolean[dp[0].length];
        for (int i = 0; i <= sum ; i++) {
            bool[i] = dp[n][i];
        }

        System.out.println(Arrays.toString(bool));
        return bool;
    }
}
