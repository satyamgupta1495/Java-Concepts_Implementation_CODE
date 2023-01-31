package com.hackerRank.problemSolving;
public class BeautyFullNumber {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {9, 7, 6, 5, 4, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    curr = curr ^ arr[j];
                }


            }
            System.out.println();
            max = Math.max(max, curr);
        }
        System.out.println(max);
    }
}
