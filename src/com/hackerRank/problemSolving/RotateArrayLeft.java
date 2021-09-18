package com.hackerRank.problemSolving;

import java.util.Arrays;

public class RotateArrayLeft {

    static void rotateByOne(int[] arr, int n){
        int i , temp;
        temp = arr[n-1];
        for ( i = n-1; i  > 0; i--) {
            arr[i] = arr[i-1];
        }
            arr[0] = temp;
    }

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            rotateByOne(arr,n);
        }
        return arr;
    }

    static int noOfRotation(int[] arr) {
        int min = arr[0];
        int minIndex = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min ){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1 ,2, 3, 4 ,5 ,6 ,7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        rotate(arr,4);
        System.out.println(Arrays.toString(arr));
        int ans = noOfRotation(arr);
        System.out.println("ANS - > " + ans);
    }
}
