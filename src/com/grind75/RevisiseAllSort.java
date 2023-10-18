package com.grind75;

import com.satyamgupta.Array;

import java.util.Arrays;

public class RevisiseAllSort {
    public static void main(String[] args) {
//        int[] nums = {5,4,3,1,2};
        int[] nums = {1, 2, 3, -4, 5};
//        quickSort(nums, 0, nums.length-1);
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void quickSort(int[] arr, int lo, int hi){

        if(lo >= hi) return;

        int s = lo;
        int e = hi;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, lo, e);
        quickSort(arr, s, hi);

    }
    static int[] mergeSort(int[] arr){

        //base case
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k] = left[i];
                i++;

            }else{
                result[k] = right[j];
                j++;

            }
            k++;
        }

        while(i < left.length){
            result[k] = left[i];
            i++;
            k++;
        }
         while(j < right.length){
            result[k] = right[j];
            j++;
            k++;
        }

        return result;

    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }

    static void bubbleSort(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j-1, j);
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
