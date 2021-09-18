package com.hackerRank.problemSolving;

import java.util.*;


public class MergeIntervals {

    static int[][] merge(int[][] intervals) {

        //! if there exist only 1 pair;
         if (intervals.length <= 1) return intervals;

         //! Sort the A[i][j] based on i;
//        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[1],arr2[1]));
        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        List<int[]> otp_arr = new ArrayList<>();

        int[] current_interval = intervals[0];
        otp_arr.add(current_interval);

        for (int[] interval:intervals ) {
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if (current_end >= next_begin){
                current_interval[1] = Math.max(current_end, next_end);

            }
            else{
                current_interval = interval;
                otp_arr.add(current_interval);
            }
        }

       

        return otp_arr.toArray(new int[otp_arr.size()][]);

    }

    public static void main(String[] args) {

        int[][] arr = {{8,10},{1,3},{2,6},{15,18}};
//        int[][] arr = { {5, 4, 7},
//                        {1, 3, 8},
//                        {2, 9, 6} };

        int[][] ans = merge(arr);
        for (int[] a:ans       ) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println((new int[arr.length]).length);

    }
}
