package com.hackerRank.problemSolving;

import com.satyamgupta.Array;

import java.util.*;

public class Matrix0 {

    //? Constant space and O(N^2)
    public void setZeroes(int[][] matrix) {

        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        int n = matrix.length;  //! row
        int m = matrix[0].length;   //! column

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }

            }
        }
        for (int r : row)
            Arrays.fill(matrix[r], 0);

            for (int c : col) {
                for (int i = 0; i < n; i++) {
                    matrix[i][c] = 0;
                }
            }

            System.out.println(row);
            System.out.println(col);

            System.out.println();

            for (int[] values : matrix) {
                System.out.println(Arrays.toString(values));
            }

        }

    public static void main(String[] args) {
        int[][] ar = {
                {1,1,2,3},
                {3,0,5,3},
                {1,10,1,5}
        };

        for (int[] values:ar ) {
        System.out.println(Arrays.toString(values));
        }

        System.out.println();
        Matrix0 max = new Matrix0();
        max.setZeroes(ar);

    }
}
