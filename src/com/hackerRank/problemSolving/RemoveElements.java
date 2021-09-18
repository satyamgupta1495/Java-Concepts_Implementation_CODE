package com.hackerRank.problemSolving;

import java.util.Arrays;

public class RemoveElements {


        static int removeElement(int[] nums, int val) {
            int count = 0;
            for(int i =0; i < nums.length; i++){
                if(nums[i] == val){
                    nums[i] = 51;
                    count++;
                }
            }
            Arrays.sort(nums);
            return nums.length-count;
        }


    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int ans = removeElement(arr,2);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
}
