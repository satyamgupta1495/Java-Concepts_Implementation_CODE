package com.hackerRank.problemSolving;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {1,-2,-3,4};

        System.out.println(maxProduct(nums));
    }
    static int maxProduct(int[] nums) {

        int ans = nums[0];
        int currMin = 1, currMax = 1;

        for(int i = 0; i < nums.length; ++i){
            int temp = currMin;

            currMin = Math.min(nums[i]*currMin, nums[i]*currMax);
            currMin = Math.min(currMin, nums[i]);

            currMax = Math.max(nums[i]*temp, nums[i]*currMax);
            currMax = Math.max(currMax, nums[i]);
            ans = Math.max(ans, currMax);


        }
        return ans;

    }
}
