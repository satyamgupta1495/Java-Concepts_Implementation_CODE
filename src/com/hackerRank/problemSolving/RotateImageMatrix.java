package com.hackerRank.problemSolving;

import java.util.Arrays;

public class RotateImageMatrix {

    //optimal solution
    void rotate(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] val: matrix ) {
            System.out.println(Arrays.toString(val));
        }
        System.out.println();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }


        for (int[] val: matrix ) {
            System.out.println(Arrays.toString(val));
        }

    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        RotateImageMatrix mat = new RotateImageMatrix();
        for (int[] val: array   ) {
            System.out.println(Arrays.toString(val));
        }
        System.out.println();
        mat.rotate(array);
    }
}
