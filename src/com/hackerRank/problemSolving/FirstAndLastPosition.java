package com.hackerRank.problemSolving;

import com.satyamgupta.Array;

import java.util.Arrays;

public class FirstAndLastPosition {

    int[] position(int[] array, int target){

        int start = 0;
        int end= array.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if (array[mid] == target && array[start] == array[end]){
                return new int[] {start,end};
            }
            else if(array[mid] == target && array[start] < target){
                start++;
            }
            else if(array[mid] == target && target < array[end]){
                end--;
            }
            else if(array[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return new int[] {-1,-1};

    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        FirstAndLastPosition pos = new FirstAndLastPosition();
        int[] ans = pos.position(arr, 8);
        System.out.println(Arrays.toString(ans));
    }
}
