package com.datastructure.DynamicProgramming.matrixchainmultiplication;

import java.util.Arrays;

public class EggDropProblem {
    public static void main(String[] args) {
        int e = 2, f = 6;
        System.out.println(solve(f,e));
    }

    static int solve(int f, int e){
        int[][] dp = new int[f+1][e+1];
        for(int i = 1; i <= f; ++i){
            for (int j = 1; j <= e ; ++j) {
                if(i == 1 && j == 1) dp[i][j] = 1;
                else if(i == 1){
                    dp[i][j] = 1;
                }else if(j == 1){
                    dp[i][j] = i;
                }else{
                    if (j <= i){
                        dp[i][j] = 1 + dp[i-1][j-1] + dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i][j-1];
                    }
                }
                if(dp[i][j] >= f){
                    for (int[] val:dp ){
                        System.out.println(Arrays.toString(val));
                    }
                    return i;
                }
            }
        }
        return 0;
    }
}
