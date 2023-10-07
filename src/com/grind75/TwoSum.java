package com.grind75;

//! https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));


    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int searchForDiff = target - nums[i];
            if(map.containsKey(searchForDiff)){
                return new int[] {i, map.get(searchForDiff)};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
