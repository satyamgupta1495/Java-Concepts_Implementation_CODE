package com.hackerRank.problemSolving;

import java.util.*;
public class MergeWithoutExtraSpace {

    static void merge(int arr1[], int arr2[]) {

        int n = arr1.length;
        int i = 0;

        int temp;

        while(arr1[n-1] > arr2[0]){

            if (arr1[i] > arr2[0]){
                temp = arr1[i];
                arr1[i]  =arr2[0];
                arr2[0] = temp;
                Arrays.sort(arr2);
            }

            i++;
        }

       // System.out.println(Arrays.toString(arr1));
       // System.out.println(Arrays.toString(arr2));

    }

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};

        merge(arr1,arr2);

    }
}
