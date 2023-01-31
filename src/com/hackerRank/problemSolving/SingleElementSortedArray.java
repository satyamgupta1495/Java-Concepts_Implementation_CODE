package com.hackerRank.problemSolving;

//! https://leetcode.com/problems/single-element-in-a-sorted-array/

//? Your solution must run in O(log n) time and O(1) space.

public class SingleElementSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int ans = binarySearch(nums);
        System.out.println(ans);
    }

    static int binarySearch(int[] nums){
        int s = 0;
        int e = nums.length-1;
        int ans = 0;
        while(s <= e){
            int mid = s + (e-s)/2;

            if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid+1]){
                return nums[mid];

            }
            if(((mid % 2) == 0 && nums[mid+1] == nums[mid]) ||
                    ((mid%2 == 1) && nums[mid] == nums[mid-1])){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }

    static int singleNonDuplicate(int[] nums) {

        int unique = nums[0];
        for(int i = 1; i < nums.length; ++i){
            System.out.println(unique + " " + nums[i]  + " " + (unique ^ nums[i]));
            unique ^= nums[i];
        }

        return unique;
    }
}
