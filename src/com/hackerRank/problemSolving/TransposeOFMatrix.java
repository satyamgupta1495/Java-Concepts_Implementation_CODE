package com.hackerRank.problemSolving;

import java.util.Arrays;

public class TransposeOFMatrix {

    static int[][] swap(int[][] mat, int i, int j){
        int temp = mat[i][i];
        mat[i][i] = mat[j][j];
        mat[j][j] = temp;
        return mat;
    }

    static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] newMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }


        return newMatrix;
    }


    public static void main(String[] args) {

        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for (int[] arr: array  ) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
        array = transpose(array);
        for (int[] arr: array  ) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
