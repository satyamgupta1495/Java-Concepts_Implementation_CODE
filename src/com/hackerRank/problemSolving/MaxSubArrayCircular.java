package com.hackerRank.problemSolving;

public class MaxSubArrayCircular {
    public static void main(String[] args) {
//        int[] arr = {5,-3,5}; -> 10
        int[] arr = {6,9,-3};
        int ans = maxSubarraySumCircular(arr);
        System.out.println(ans);
    }

    static int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currSum = 0;

        for(int i = 0; i <= nums.length; ++i){

            int elem = nums[(i+1) % n];
            System.out.println(i%n + " " + elem);

            if(currSum < 0) {
                currSum = 0;
            }
            currSum += elem;
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
