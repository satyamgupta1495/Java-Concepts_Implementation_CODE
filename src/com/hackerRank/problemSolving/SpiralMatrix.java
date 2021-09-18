package com.hackerRank.problemSolving;

import java.util.*;

public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {

            List<Integer> list = new ArrayList<>();

            int rowBegin = 0;
            int columBegin = 0;
            int rowEnd = matrix.length-1;
            int columEnd = matrix[0].length-1;

            while(rowBegin <= rowEnd && columBegin <= columEnd){

                for(int i = columBegin; i <= columEnd; i++){
                    list.add(matrix[rowBegin][i]);
                }
                rowBegin++;

                for(int i = rowBegin; i <= rowEnd; i++){
                    list.add(matrix[i][columEnd]);
                }
                columEnd--;

                if(rowBegin <= rowEnd){


                    for(int i = columEnd; i >=  columBegin; i--){
                        list.add(matrix[rowEnd][i]);
                    }
                }
                rowEnd--;

                if(columBegin <= columEnd){
                    for(int i = rowEnd; i >=  rowBegin; i--){
                        list.add(matrix[i][columBegin]);
                    }
                }
                columBegin++;


            }

            return list;

        }


    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        SpiralMatrix mat = new SpiralMatrix();
        mat.spiralOrder(matrix);
    }
}
