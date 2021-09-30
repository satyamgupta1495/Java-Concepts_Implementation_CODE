package com.datastructure.DynamicProgramming;

public class UB2_MaxWayCoinChange {
    public static void main(String[] args) {

        int[] arr ={2,5,3,6};
        int sum = 10 , len = 4;
        long ans = getCount(arr,len,sum);
        System.out.println(ans);

/*
        Output: 5
        Explanation: Five Possible ways are:
        {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5}
        and {5,5}
*/
    }

    static long getCount(int[] arr, int n, int sum){

        long[][] dp = new long[n+1][sum+1];

        for(int i = 0; i <= n; ++i){
            for(int j = 0; j <= sum; ++j){
                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 1;
            }
        }

        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= sum; ++j){

                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] + dp[i][j-arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }

            }
        }
        return dp[n][sum];

    }
}
