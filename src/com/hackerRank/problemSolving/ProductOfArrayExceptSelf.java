package com.hackerRank.problemSolving;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];


        left[0] = 1;
        right[n-1] = 1;

        for(int i = 1; i < n; ++i){
            left[i] = left[i-1] * nums[i-1];
        }

        int R = 1;

        for(int i = n-1; i >= 0; --i){
            left[i] = left[i] * R;
            System.out.println(R);
            R *= nums[i];
        }


        System.out.println(Arrays.toString(left));


    }

}
