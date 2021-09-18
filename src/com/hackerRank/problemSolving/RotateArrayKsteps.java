package com.hackerRank.problemSolving;

import java.util.*;

public class RotateArrayKsteps {

//! O(N) TC     
    public void rotateArray(int[] nums, int k) {
        k = k% nums.length;
        reverse(nums, 0,  nums.length-k-1);
        reverse(nums,  nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);


    }

    void reverse(int[] array, int start, int end){
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }

        rotate(arr,K);
        System.out.println(Arrays.toString(arr));


    }

    static int[] rotate(int[] array, int k){
        while(k != 0){
            int temp = array[array.length-1];
            for (int i = array.length-1; i > 0 ; i--) {
                array[i] = array[i-1];

            }
            array[0] = temp;
            k--;
        }
        return array;
    }
}
