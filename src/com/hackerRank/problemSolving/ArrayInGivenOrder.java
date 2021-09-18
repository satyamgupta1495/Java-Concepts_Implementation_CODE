package com.hackerRank.problemSolving;

import java.util.Arrays;

public class ArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(index));
        createTargetArray(nums, index);
    }
    static int[] createTargetArray(int[] nums, int[] index) {

        int[] targetArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int p = index[i];
            if (targetArray[p] == 0){
                targetArray[p] = nums[p];
            }
            else{
                int temp = targetArray[p];
                targetArray[p] = nums[p];
                for (int j = p+1; j < targetArray.length-1; j++) {

                }

            }
        }
        System.out.println(Arrays.toString(targetArray));
        return targetArray;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
