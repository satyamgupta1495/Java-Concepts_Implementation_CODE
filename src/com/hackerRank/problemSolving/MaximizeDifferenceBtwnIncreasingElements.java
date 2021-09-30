package com.hackerRank.problemSolving;

public class MaximizeDifferenceBtwnIncreasingElements {

    public static void main(String[] args) {
       int[] nums = {1,5,2,10};
        System.out.println(maxmizeDiff(nums));
    }

    static int maxmizeDiff(int[] nums){
        int n = nums.length;
        int max = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (i < j && nums[i] < nums[j]){
                    max = Math.max(max,Math.abs(nums[i] - nums[j]));
                }
            }
        }

        return max;
    }

    //! OPTIMAL
    public int maxProfit(int[] prices) {

        int minSoFar = prices[0];
        int profit  = 0;

        for(int i = 1; i < prices.length; ++i){
            if(prices[i] < minSoFar){
                minSoFar = prices[i];
            }

            if(profit < prices[i] - minSoFar){
                profit = prices[i] - minSoFar;
            }
        }

        return profit;

    }

}
