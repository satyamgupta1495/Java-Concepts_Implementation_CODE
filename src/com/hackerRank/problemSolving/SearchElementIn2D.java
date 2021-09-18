package com.hackerRank.problemSolving;

/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

        -> Integers in each row are sorted from left to right.
        -> The first integer of each row is greater than the last integer of the previous row.

Input: matrix = [[1,3,5,7],
                [10,11,16,20],
                [23,30,34,60]], target = 3
Output: true

Input: matrix = [[1,3,5,7],
                [10,11,16,20],
                [23,30,34,60]], target = 13
Output: false

 */

import java.util.Arrays;

public class SearchElementIn2D {

    static void searchMatrix(int[][] matrix, int target) {


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target){
                    System.out.println( matrix[i][j] + " is present -> "+ i + " " + j + " " );
                }
            }
            System.out.println();
        }
    }


    //! STAIRCASE METHOD

    static int[] binSearch(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;

        int[] arr = new int[2];
        int i = 0;
        int j = matrix[0].length-1;

        while(i >= 0 && i < n && j >= 0 && j < m ){
            if (matrix[i][j] == target){
                arr[0] = i;
                arr[1] = j;
                break;
            }
            else if (matrix[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }

    return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},
                       {10,11,16,20},
                       {23,30,34,60}};
//        searchMatrix(arr,3);
        int[] ans = binSearch(arr,39);
        System.out.println(Arrays.toString(ans));
    }
}
