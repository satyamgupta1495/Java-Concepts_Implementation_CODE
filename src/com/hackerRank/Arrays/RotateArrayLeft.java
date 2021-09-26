package com.hackerRank.Arrays;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = rotateKtimes(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    static int[] rotateKtimes(int[] arr, int k){
        for (int i = 0; i < k; i++) {
            rotateOnce(arr);
        }
        return arr;
    }

    static int[] rotateOnce(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}
