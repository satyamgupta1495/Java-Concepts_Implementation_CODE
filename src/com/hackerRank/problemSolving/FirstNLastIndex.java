package com.hackerRank.problemSolving;
import com.satyamgupta.Array;
import java.util.Arrays;

public class FirstNLastIndex {

    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target && nums[start] == nums[end]) {
                return new int[]{start, end};
            } else if(nums[mid] == target && nums[start] < target) {
                start++;
            } else if(nums[mid] == target && target < nums[end]) {
                end--;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        FirstNLastIndex index = new FirstNLastIndex();
        int[] arr2 = index.searchRange(arr, 8);
        System.out.println(Arrays.toString(arr2));
    }

}
