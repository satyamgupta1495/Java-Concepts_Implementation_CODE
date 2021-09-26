package com.datastructure.DynamicProgramming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(countSubSetWitGivenDifference(arr,1));

        System.out.println(Arrays.stream(arr).sum());

        IntStream.range(0, arr.length).forEach(x -> System.out.println(x));
    }

    static int countSubSetWitGivenDifference(int[] arr, int diff){

        int sum = 0;
        for (int val:arr) {
            sum += val;
        }

        int finalSum = (sum + diff)/2;
        return countSubSet(arr, finalSum);

    }

    static int minSubSetDifference(int[] arr){
        int range = 0;
        for (int val: arr  ) {
            range += val;
        }

        boolean[] bool = isPresent(arr, range);
//        System.out.println();
//        System.out.println(Arrays.toString(bool));

        int[] temp = new int[bool.length];
        int x = 0;
        for (int i = 0; i < bool.length/ 2; i++) {
            if(bool[i] == true){
                temp[x] = i;
                x++;
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < temp.length; i++) {
            res = Math.min(res , range-2*temp[i]);
        }

        return res;
    }

    static boolean equalSumPartition(int[] arr, int sum){

        int ansSum = 0;
        for (int val: arr  ) {
            ansSum += val;
        }
        if (ansSum % 2 != 0) return false;

        return isSubSetPresent(arr, ansSum);
    }

    static int countSubSet(int[] arr, int sum){

        int n = arr.length;
        int[][] dp = new int[n+1][sum+1];

        for (int i = 0; i <= n ; ++i) {
            for (int j = 0; j <= sum ; j++) {
                if (i == 0) dp[i][j] = 0;
                if (j == 0) dp[i][j] = 1;
            }
        }
        for (int i = 1; i <= n ; ++i) {
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

    static boolean isSubSetPresent(int[] arr, int sum){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        for (int i = 0; i <= n ; ++i) {
            for (int j = 0; j <= sum ; j++) {
                if (i == 0) dp[i][j] = false;
                if (j == 0) dp[i][j] = true;
            }
        }
        for (int i = 1; i <= n ; ++i) {
            for (int j = 1; j <= sum ; j++) {
                if (arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }

    //! For minimum diff
    static boolean[] isPresent(int[] arr, int sum){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        for (int i = 0; i <= n ; ++i) {
            for (int j = 0; j <= sum ; j++) {
                if (i == 0) dp[i][j] = false;
                if (j == 0) dp[i][j] = true;
            }
        }
        for (int i = 1; i <= n ; ++i) {
            for (int j = 1; j <= sum ; j++) {
                if (arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for (boolean[] val:dp    ) {
            System.out.println(Arrays.toString(val));
        }
        boolean[] bool = new boolean[sum+1];
        for (int i = 0; i <= sum ; i++) {
            bool[i] = dp[n][i];
        }

        return bool;
    }
}
