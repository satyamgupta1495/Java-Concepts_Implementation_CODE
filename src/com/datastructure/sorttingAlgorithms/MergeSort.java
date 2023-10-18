package com.datastructure.sorttingAlgorithms;

import java.util.*;

public class MergeSort
{
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
//        System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }


    static int[] mergeSort(int[] arr){
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[left.length + right.length];
        while( i < left.length && j < right.length){
            if (left[i] < right[j]){
                res[k] = left[i];
                ++i;
            }else{
                res[k] = right[j];
                ++j;
            }
            ++k;
        }
        while(i < left.length){
            res[k] = left[i];
            ++i;
            ++k;
        }
        while(j < left.length){
            res[k] = left[j];
            ++j;
            ++k;
        }
        return res;
    }

    static void mergeSortInPlace(int[] arr, int s, int e){

        if ((e-s) == 1) return;
        int mid = s + (e-s)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        merge(arr, s, mid, e);

    }

    private static void merge(int[] arr, int s,int m, int e) {

        int i = s, j = m, k = 0;
        int[] res = new int[e-s];
        while (i < m && j < e){
            if (arr[i] < arr[j]){
                res[k] = arr[i];
                ++i;
            }else{
                res[k] = arr[j];
                ++j;
            }
            ++k;
        }

        while(i < m){
            res[k] = arr[i];
            k++;
            i++;
        }

        while(j < e){
            res[k] = arr[j];
            k++;
            j++;
        }

        for (int l = 0; l < res.length; l++) {
            arr[l+s] = res[l];  // l+s becoz suppose s = 3 ? then it will start filling the array from 0 + 3 = 3 and so on
            }
    }



}