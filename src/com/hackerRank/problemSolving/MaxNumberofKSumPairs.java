package com.hackerRank.problemSolving;

//!  https://leetcode.com/problems/max-number-of-k-sum-pairs/

public class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 5;

        checkSum(nums, k);

    }

    static void checkSum(int[] arr, int k){
            int count = 0;
            int n = arr.length;
            for(int i=0; i<n; i++){
                int sum = 0;
                for(int j=1; j<n; j++){
                    sum+=arr[j];
                    if(sum == k){
                        System.out.println(sum + " ");
                        count++;
                    }
                }
            }

        System.out.println(count);
        }
    }

