package com.datastructure.DynamicProgramming;

import java.util.Arrays;

public class K3_CountSubSet {
    public static void main(String[] args) {
//        int[] arr = {2,3,5,6,8,10} -> 3;
//        int[] arr = {1,2,3} ;
        int[] arr = {1,1,1};
        int ans = subsetSum1(arr,3, 2);
        System.out.println();
        System.out.println("Answer -> " + ans);
    }

    static int countSubSet(int[] arr, int sum){
        int n = arr.length;
        int[][] dp = new int[n+1][sum+1];

        //! Initialization
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0 && j == 0) dp[i][j] = 1;
                else if (i == 0){
                    dp[0][j] = 0;
                }
                else if (j == 0){
                    dp[i][0] = 1;
                }
                else if (arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for (int[] val:dp ) {
            System.out.println(Arrays.toString(val));
        }


        return dp[n][sum];
    }

    static int subsetSum1(int a[], int n, int sum)
    {

        // Initializing the matrix
        int tab[][] = new int[n + 1][sum + 1];

        // Initializing the first value of matrix
        tab[0][0] = 1;

        for(int i = 1; i <= sum; i++)
            tab[0][i] = 0;

        for(int i = 1; i <= n; i++)
            tab[i][0] = 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= sum; j++)
            {

                // If the value is greater than the sum
                if (a[i - 1] > j)
                    tab[i][j] = tab[i - 1][j];

                else
                {
                    tab[i][j] = tab[i - 1][j] +
                            tab[i - 1][j - a[i - 1]];
                }
            }
        }

        return tab[n][sum];
    }
}
