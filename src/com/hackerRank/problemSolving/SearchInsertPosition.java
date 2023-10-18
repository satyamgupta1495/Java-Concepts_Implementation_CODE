package com.hackerRank.problemSolving;

//https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }

    public static int searchInsert(int[] nums, int target) {


                int s = 0;
                int e = nums.length-1;
                while(s <= e){
                    int mid = s + (e-s)/2;

                    if(nums[mid] == target) return mid;
                    else if(nums[mid] < target) s = mid+1;
                    else e = mid-1;
                }
                return e+1;


    }
}
