package com.hackerRank.problemSolving;

import java.util.*;

public class test {

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int ans = nums[0];
        int currMin = 1, currMax = 1;

        List<Integer> cmin = new ArrayList<>();
        List<Integer> cmax = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i< nums.length; ++i){
            int temp = currMin;
            tmp.add(temp);

            cmin.add(currMin);
            currMin = Math.min(nums[i] *currMin, nums[i]*currMax);
            currMin = Math.min(currMin, nums[i]);


            cmax.add(currMax);
            currMax = Math.max(nums[i] *currMax, nums[i]*temp);
            currMax = Math.max(currMax, nums[i]);
            ans = Math.max(ans, currMax);
            answer.add(ans);
        }
        System.out.println(ans);
        System.out.println(cmin);
        System.out.println(tmp);
        System.out.println(cmax);
    }
}
