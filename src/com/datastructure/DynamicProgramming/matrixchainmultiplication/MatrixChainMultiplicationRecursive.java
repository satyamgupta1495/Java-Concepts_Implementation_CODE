package com.datastructure.DynamicProgramming.matrixchainmultiplication;
/*

    1- Find i, j;
    2- Find Base Condt.
    3- Find k loop scheme.
    4- Claculate ans from tempans.

*/

import com.satyamgupta.Array;

import java.util.Arrays;

public class MatrixChainMultiplicationRecursive {
    static  int[][] dp = new int[1001][1001];
    public static void main(String[] args) {
        for (int[] val: dp  ) {
            Arrays.fill(val,-1);
        }
        int p[] = {40, 20, 30, 10, 30};
        System.out.println(mcm(p,1,p.length-1));
    }
    static int mcm(int[] arr, int i, int j){


        if ( i >= j) return 0;

        if (dp[i][j] != -1) return dp[i][j];
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j ; k++) {
            int tempAns = mcm(arr, i, k) +
                    mcm(arr,k+1, j) + arr[i-1]*arr[k]*arr[j];
            if (tempAns < min){
                min = tempAns;
            }
        }

       return dp[i][j] =  min;

    }
}
