package com.newbeginning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));

       int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int resTillNow = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j){
                    continue;
                }else {
                    resTillNow = resTillNow * nums[j];
                }
            }
            arr[i] = resTillNow;
        }

        System.out.println(arr);


    }
}
