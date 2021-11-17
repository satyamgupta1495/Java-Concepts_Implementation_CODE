package com.hackerRank.problemSolving;

//! https://leetcode.com/problems/iterator-for-combination/

import java.util.*;

public class IteratorforCombination {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        int[] nums = {1,2,3};
        getSubSet(nums, nums.length, 0,0, res);
        System.out.println(res);
    }

    private static void getSubSet(int[] nums, int length, int start, int end, List<List<Integer>> res) {

        ArrayList<Integer> l1 = new ArrayList<>();
        if (end == 0){
            System.out.println(nums);
        }

    }


}
