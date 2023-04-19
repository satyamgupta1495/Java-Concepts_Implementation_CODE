package com.hackerRank.gfgPTOD;

import java.util.Arrays;

public class CountSpecialNumbers {

//! https://practice.geeksforgeeks.org/problems/3d49e4cce2820a813da02d1587c2dd9c542ce769/1

//    N = 4
//    arr[] = {5, 5, 5, 5}
//    Output: 4

    public static void main(String[] args) {
        int n = 5;
        int[] arr= {6,6,2,3,2};
        int res = countSpecialNumbers2(n, arr);
        System.out.println(res);
    }

    public static int countSpecialNumbers(int n, int[] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean tempCount = false;
            for (int j = 0; j < arr.length; j++) {
                if(i != j && (arr[i] % arr[j] == 0)){
                    System.out.println(arr[i] + " " + arr[j]);
                    tempCount = true;
                }
            }
            if(tempCount == true){
                count++;

            }
        }
        return count;
    }


    public static int countSpecialNumbers2(int n, int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(max < arr[i]) max = arr[i]; //find max element
        }

        int[] tempArr = new int[max+1];
        Arrays.fill(tempArr, 0); //! initialize an array with 0
        for (int i = 0; i < n; i++) {
            if(tempArr[i] <= 1){
                for (int j = arr[i]; j <= max ; j++) {
                    tempArr[j]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(tempArr[i] > 1){
                count++;
            }
        }
        return count;

    }
}
