package com.hackerRank.problemSolving;

public class KadanesAlgorithm {

    static int maxSubarraySum(int arr[]){
        int maxSum = -1;
        int curr_Sum = 0;

        for(int i = 0; i < arr.length; i++) {
            curr_Sum += arr[i];

            if(curr_Sum > maxSum){
                maxSum = curr_Sum;
            }
            if (curr_Sum < 0) {
                curr_Sum = 0;
            }
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int[] arr = {-2 ,1 ,-3 ,4 ,-1 ,2, 1, -5 ,4};
        int ans = maxSubarraySum(arr);
        System.out.println(ans);

    }

}
