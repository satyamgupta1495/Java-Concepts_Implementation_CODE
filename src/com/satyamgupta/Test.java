package com.satyamgupta;

import java.util.*;

public class Test {

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd)
        {
            for(int i = colBegin; i <= colEnd; i++){
                list.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for(int i = rowBegin; i <= rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    list.add(matrix[rowEnd][i]);
                }

            }
            rowEnd--;
            if (colBegin < colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    list.add(matrix[i][colBegin]);
                }

            }
            colBegin++;

        }
        System.out.println(list);
        return list;
    }

    /*
     int count = 0;
        List<List<Integer>> finalList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            list1.add(list.get(count));
        }

        List<Integer> list2 = new ArrayList<>();
        for(int i = 3; i < 6; i++){
            list1.add(list.get(count));
        }

        List<Integer> list3 = new ArrayList<>();
       for(int i = 6; i < list.size(); i++){
            list1.add(list.get(count));
        }

        finalList.add(list1);
        finalList.add(list2);
        finalList.add(list3);

        return finalList ;


     */

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
//        for (int[] elem: arr) {
//            System.out.println(Arrays.toString(elem));
//        }
        System.out.println();
        spiralOrder(arr);

        int n = 3;
        int[][] matrix = new int[n][n];

        int num = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = num;
                num++;

            }
        }

        for (int[] elem: matrix) {
            System.out.println(Arrays.toString(elem));
        }
    }

}
