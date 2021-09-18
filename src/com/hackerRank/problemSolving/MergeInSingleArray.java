package com.hackerRank.problemSolving;

import java.util.Arrays;

public class MergeInSingleArray {

    static void merge(int A[],int m, int B[], int n) {

        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j >= 0) {
            A[k--] = A[i] > B[j] ? A[i--] : B[j--];
        }
        while(j >= 0) {
            A[k--] = B[j--];
        }
        System.out.println(Arrays.toString(A));
    }

    public static void main(String[] args) {

        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};

        merge(arr1, arr1.length,arr2,arr2.length);

    }
}
