package com.hackerRank.problemSolving;
//https://leetcode.com/problems/sort-array-by-parity/description/


import java.util.Arrays;

public class ParitySort905 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        paritySort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void paritySort(int[] arr){

        int i = 0;
        int j = arr.length-1;

        while(i < j){
            if(arr[i] % 2 == 0){
                i++;
            }else{
                swap(arr, i , j);
               j--;
            }
        }

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
