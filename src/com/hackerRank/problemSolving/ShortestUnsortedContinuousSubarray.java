package com.hackerRank.problemSolving;


//! https://leetcode.com/problems/shortest-unsorted-continuous-subarray/

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
       int[] nums = {2,6,4,8,10,9,15};

       int end = -1;
       int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]){
                end = i;
            }else{
                max = nums[i];
            }
        }

       int min = nums[nums.length-1];
       int st = -1;

        for (int i = nums.length-2; i >= 0; i--) {
            if (min < nums[i]){
                st = i;
            }else{
                min = nums[i];
            }
        }
        System.out.println((end-st) + 1);
    }
}
