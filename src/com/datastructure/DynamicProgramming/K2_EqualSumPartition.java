package com.datastructure.DynamicProgramming;

//! Sum of all the numbers in an array should be EVEN
public class K2_EqualSumPartition {

    public static void main(String[] args) {
        int[] arr = {5,3,1};
        boolean ans = equalSum(arr,11, arr.length);
        System.out.println(ans);
    }

    static boolean equalSum(int[] arr, int sum, int n ){
        if (sum == 0 || arr.length == 0) return false;
        int equalSum = 0;
        for (int val:arr) {
            equalSum += val;
        }

        if (equalSum % 2 == 0) {
            return K1_SubSetSumProblem.subSet(arr.length,arr,equalSum / 2);
        }

        return false;

    }

}
