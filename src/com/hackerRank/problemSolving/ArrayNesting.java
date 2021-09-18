package com.hackerRank.problemSolving;

import java.util.ArrayList;
import java.util.*;

public class ArrayNesting {

    static int countLongestLoop(int[] nums) {
        int count = 0;
        int maxCount = 1;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i)) {
                int j = i;
                count = 0;
                while (!set.contains(j)) {
                    set.add(j);
                    j = nums[j];
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
            return maxCount;
    }
    public static void main(String[] args) {
        int[] nums = {5, 4, 0, 3, 1, 6, 2};
        int ans = countLongestLoop(nums);
        System.out.println(ans);
    }
}
