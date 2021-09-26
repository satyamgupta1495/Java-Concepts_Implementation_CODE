package com.hackerRank.problemSolving;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int[][] ans = matrixReshape(arr, 1,0);

        for (int[] val:ans) {
            System.out.println(Arrays.toString(val));
        }
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] opt_arr = new int[r][c];
        int rowMat = mat.length;
        int colMat = mat[0].length;
        if (rowMat * colMat != r * c) return mat;

        int row = 0;
        int col = 0;
        for(int i = 0; i < rowMat; ++i){
            for(int j = 0; j < colMat; ++j){
                opt_arr[row][col] = mat[i][j];
                col++;
                if (col == c){
                    col = 0;
                    row++;

                }
            }
        }
        return opt_arr;
    }

}
