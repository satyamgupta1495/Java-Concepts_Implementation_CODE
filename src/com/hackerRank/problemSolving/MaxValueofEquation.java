package com.hackerRank.problemSolving;

import java.util.Arrays;

public class MaxValueofEquation {
    public static void main(String[] args) {
//        int[][] points = {{1,3},{2,0},{5,10},{6,-10}};
        int[][] points = {{0,0},{3,0},{9,2}};
        for (int[] val:points ) {
            System.out.println(Arrays.toString(val));
        }
        int ans = findMaxValueOfEquation(points, 3);

    }
    static int findMaxValueOfEquation(int[][] points, int k) {

        int max = 0;

        for (int i = 0; i < points.length-1; i++) {

        }
        for(int i = 0; i < points.length-1; ++i){
            for(int j = 0; j < 1; ++j){
                boolean ans = isValid(points[i][j], points[i][j], k);
                System.out.println(ans);


            }
        }


        return max;
    }

    static boolean isValid(int x1, int x2, int k){
        System.out.println(x1 + " " + x2);
        System.out.println(Math.abs(x1-x2) <= k);
        return Math.abs(x1-x2) <= k;
    }
}
