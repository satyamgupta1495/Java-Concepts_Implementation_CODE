package com.hackerRank.problemSolving;

/*
Given an array arr[] of size N where every element is in the range from 0 to n-1.
Rearrange the given array so that arr[i] becomes arr[arr[i]].

Example 1:

Input:
N = 5
arr[] = {4,0,2,1,3}
Output: 3 4 2 0 1
Explanation:
arr[arr[0]] = arr[4] = 3.
arr[arr[1]] = arr[0] = 4.
and so on.

 */

import java.util.Arrays;

public class RearrangeanArray {

    public static void main(String[] args) {

        int arr[] = {0,6,3,4,2,5,1};

        System.out.println(Arrays.toString(arr));


        int max = arr.length;
        //0 1 4 2 3 5 6
        for(int i = 0; i < max; i++)
            arr[i] = ( arr[ (int) arr[i] ] % max) * max +arr[i];

        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        for(int i = 0; i < max; i++)
            arr[i] = arr[i] / max;

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i , int j){

        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }

}
