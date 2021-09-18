package com.hackerRank.problemSolving;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr = generateSpiralMatrix(3);

        for (int[] elem : arr) {
            System.out.println(Arrays.toString(elem));
        }
    }

    static int[][] generateSpiralMatrix(int n){

        int totalCount = n*n;
        int count = 1;
        int[][] matrix = new int[n][n];

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length-1;

        while(rowBegin <= rowEnd && columnBegin <= columnEnd && count <= totalCount)
        {

            for (int i = columnBegin; i <= columnEnd; i++) {
                matrix[rowBegin][i] = count;
                count++;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd ; i++) {
                matrix[i][columnEnd] = count;
                count++;
            }
            columnEnd--;

            if (rowBegin <= rowEnd){
                for (int i = columnEnd; i >= columnBegin ; i--) {
                    matrix[rowEnd][i] = count;
                    count++;
                }
            }
                rowEnd--;
            if (columnBegin <= columnEnd){
                for (int i = rowEnd; i >= rowBegin ; i--) {
                    matrix[i][columnBegin] = count;
                    count++;
                }
            }
                columnBegin++;

        }

        for (int[] elem : matrix) {
            System.out.println(Arrays.toString(elem));
        }





        return matrix;
    }
}