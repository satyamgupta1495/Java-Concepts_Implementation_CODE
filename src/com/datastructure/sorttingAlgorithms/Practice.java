package com.datastructure.sorttingAlgorithms;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        // int[] array = {0,1,3,4,5,6,7,8,9};
        // int res = binarySearch(array,4);

        // int[] array = {9,8,7,6,5,4,3,2,1};
//        int[] array = {0,1,3,4,5,6,7,8,9};
//        int res = orderAgnosticBinarySearch(array,6);
//        System.out.println(res);


        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;


        while(s <= e){
            int mid = s + (e-s) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }

        return -1;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        boolean isAscending = arr[s] < arr[e];

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

    public static boolean isAgnostic(int[] arr){
        if(arr.length >= 2){
            return arr[1] < arr[0];
        }
        return false;
    }

    public static int cyclicSort(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    return -1;
    }
    
    public static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    

}
