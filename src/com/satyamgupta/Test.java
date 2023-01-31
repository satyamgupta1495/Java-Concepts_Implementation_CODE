package com.satyamgupta;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,1};
        quickSort(arr, 0, arr.length-1);


        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> res = spiralMatrix(matrix);
        int x = 0;
        int[][] ans = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[i][j] = res.get(x);
                ++x;
            }
        }

        for (int[] val: ans  ) {
            System.out.println(Arrays.toString(val));
        }


    }


    static List<Integer> spiralMatrix(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = mat.length-1;
        int colEnd = mat[0].length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                list.add(mat[rowBegin][i]);
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                list.add(mat[i][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd){

                for (int i = colEnd; i >= colBegin; i--) {
                    list.add(mat[rowEnd][i]);
                }
        }
            rowEnd--;

            if (colBegin <= colEnd){

                for (int i = rowEnd; i >= rowBegin; i--) {
                    list.add(mat[i][colBegin]);
                }
        }
            colBegin++;
        }

        return list;
    }

    static void quickSort(int[] arr, int lo, int hi){

        if (lo >= hi) return;
        int s = lo, e = hi;
        int mid = s + (e-s)/2;

        int pivot = arr[mid];

        while(s <= e){

            while(arr[s] < pivot){
                ++s;
            }

            while(arr[e] > pivot){
                --e;
            }

            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                ++s;
                --e;
            }

        }
        quickSort(arr,lo,e);
        quickSort(arr,s,hi);
    }

    static void mergeInPlace(int[] arr, int s, int e){

        if (e-s == 1) return;

        int mid = (s+e)/2;

        mergeInPlace(arr,s, mid);
        mergeInPlace(arr,mid,e);

        merge(arr, s,mid,e);

    }


    private static void merge(int[] arr,  int s, int m, int e) {
        int i = s , j = m, k = 0;
        int[] res = new int[e-s];

        while(i < m && j < e) {
            if (arr[i] < arr[j]){
                res[k] = arr[i];
                ++i;
            }else{
                res[k] = arr[j];
                ++j;
            }
            ++k;
        }

        //! for individual remaining array

        while( i < m){
            res[k] = arr[i];
            ++k;
            ++i;
        }
        while( j < e){
            res[k] = arr[j];
            ++k;
            ++j;
        }

        for (int l = 0; l < res.length; l++) {
            //! arr[s+l] only for modifying the range
            arr[s+l] = res[l];
        }


    }

}
