package com.datastructure.DynamicProgramming;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[]  nums = {2,0,1,2,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortColors(int[] nums) {

        int pt0 = 0;
        int pt1 = 0;
        int pt2 = nums.length-1;

        while(pt1 <= pt2) {
            switch (nums[pt1]) {
                case 0: {
                    swap(nums, pt1, pt0);
                    pt0++;
                    pt1++;
                    break;
                }
                case 1: {
                    pt1++;
                    break;
                }
                case 2: {
                    swap(nums, pt1, pt2);
                    pt2--;
                    break;
                }
                default:
                    pt1++;
            }
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
