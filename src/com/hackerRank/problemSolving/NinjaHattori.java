package com.hackerRank.problemSolving;

public class NinjaHattori {
    public static void main(String[] args) {
        int[][] arr = {{-2,6},
                {12,-13},
                {19,18},
                {16,8},
                {-11,-9}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = 0; j < arr[0].length; j++) {
                curr += arr[i][j];
                if(curr < 0) curr = 0;
                else{
                    sum += curr;
                }
            }

        }
        System.out.println(sum);
    }
}
