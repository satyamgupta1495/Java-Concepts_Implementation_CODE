package com.datastructure.DynamicProgramming;

import java.util.Arrays;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
//        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(jump(arr));
    }

    static int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE); //Initially we do not know, what is min steps, hence initialize all with Integer.MAX_Value.
        dp[0] = 0;
        for (int i = 1; i < n; i++) { //Start from 1 to n
            for (int j = 0; j < i; j++) { //At each index, get min steps to reach dp[i] by looping from begining (i.e. start from 0 till i)
                if (j + nums[j] >= i) { //if j+nums[j] >=i, then from 'j' index we can have j+nums[j] jump, which can reach (or go over) nums[i]. This means we can jump from index 'j'.
                    dp[i] = Math.min(dp[i], dp[j] + 1); //Check if the this is min.
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n - 1];
    }

    
}
