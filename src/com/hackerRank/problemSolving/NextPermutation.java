package com.hackerRank.problemSolving;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {

        int[] nums = {3,2,1};

        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void nextPermutation(int[] nums) {

        int idx1 = 0, idx2 = 0;

        //! 5 4 3 2 1

        for (int i = nums.length-2; i >= 0 ; i--) {
            if (nums[i] < nums[i+1]){
                idx1 = i;
                break;
            }
        }

        if (idx1 <= 0){
            Collections.reverse(Arrays.asList(nums));
        }else{
            for (int i = nums.length-1; i >= 0 ; i--) {
                if (nums[i] > nums[idx1]){
                    idx2 = i;
                    break;
                }
            }
        }

        //! swap
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;

        reverse(nums, idx1+1);



    }

    static void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length;

       int[] res = Arrays.copyOfRange(nums, start, nums.length);
       Arrays.sort(res);
       System.out.println(Arrays.toString(res));

       int x = start;
        for (int k = 0; k < res.length; k++) {
            nums[x] = res[k];
            x++;
        }
        System.out.println(Arrays.toString(nums) + " ----");

    }
}
