package com.hackerRank.problemSolving;

public class MissingPositiveNumber {
    public static void main(String[] args) {
//        int[] arr = {3,4,-1,1};
        int[] arr = {7,8,9,11,12};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] nums)
    {
        int start = 1;
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min && !(nums[i] < 0)){
                min = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max && !(nums[i] < 0)){
                max = nums[i];
            }
        }

        System.out.println(min);
        System.out.println(max);



        return start;
    }
}
