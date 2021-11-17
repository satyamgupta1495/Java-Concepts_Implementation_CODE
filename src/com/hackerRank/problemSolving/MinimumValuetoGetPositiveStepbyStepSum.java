package com.hackerRank.problemSolving;

public class MinimumValuetoGetPositiveStepbyStepSum {
    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        System.out.println(getNum(nums,1));
    }

    static int getNum(int[] nums, int val){
        int total = val;
        for(int num : nums){
            total += num;
            if(total < 1){
                return getNum(nums,val+1);
            }
        }
        return val;
    }

}
