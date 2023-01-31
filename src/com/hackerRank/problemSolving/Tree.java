package com.hackerRank.problemSolving;

public class Tree {
    public static void main(String[] args) {
        int[] arr = {1, 14, 76, 46, 54, 22, 5, 68, 68, 94 };
//        int[] arr = {1,2,3};

        int ans = arr[0];
        int curr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr = curr + arr[i];
        }

        System.out.println(curr);
    }
}
