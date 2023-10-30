package com.datastructure.DynamicProgramming;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        int[]  nums = {2,3,5,6,8,10};
        int[]  nums = {1,1,1,1,1};
        int n = nums.length;

        int res = findTargetSumWays(nums, 3);
        System.out.println(res);
    }

    public static int findTargetSumWays(int[] nums, int target) {


        int sum = 0;
        for(int x : nums){
            sum += x;
        }


        if(nums.length < 2 || target > sum) return 0;

        // s1 - s1 = diff
        // s1 + s1 = sum
        // 2s1 = diff + sum
        // s1 = diff + sum /2;
        int subSetSum = (target + sum)/2;

        int[][] t = new int[nums.length+1][subSetSum+1];
        t[0][0] = 1;

        int res = countSubSetSum(nums, nums.length,subSetSum, t);
        return res;

    }

    public static int countSubSetSum(int[] arr, int n, int tar, int[][] t){

        for(int i = 1; i <= n; ++i){
            for(int j = 0; j <= tar; ++j){
                 if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }else if(arr[i-1] > j){
                    t[i][j] = t[i-1][j];
                }
            }
        }

        for (int[] x: t ) {
            System.out.println(Arrays.toString(x));
        }
        return t[n][tar];
    }

    public static void subSetSum(int n, int[] arr, int sum, boolean[][] t){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sum; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

    }

    public static void countSubSet(int n, int[] arr, int sum, int[][] t){

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum ; j++) {
                if(j == 0){
                    t[i][j] = 1;
                }else if(i == 0){
                    t[i][j] = 0;
                }else if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }else if(arr[i-1] > j){
                    t[i][j] = t[i-1][j];
                }
            }
        }

    }




}
