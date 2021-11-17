package com.hackerRank.problemSolving;

//! https://leetcode.com/problems/best-sightseeing-pair/

import java.util.ArrayList;

public class BestSightseeingPair {
    public static void main(String[] args) {
        int[] nums = {8,1,5,2,6};

        int max = nums[0] + 0;
        int ans = 0;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> an = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            ans = Math.max(ans, max + nums[i] - i);
            an.add(ans);
            max = Math.max(max, nums[i]+ i);
            list.add(max);
        }

        System.out.println(max);
        System.out.println(an);
        System.out.println(ans);

    }

}
