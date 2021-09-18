package com.hackerRank.problemSolving;

import java.util.*;

public class test {

        static int maxRange(int[] arr, int start, int end) {
            if ( arr == null) {
                return -1;
            }
            int max = arr[start];

            for(int i = start; i <= end; i++) {
                if ( arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

    public static void main(String[] args) {

        int[] arr = {11, 24, 13, 35, 15};
        int ans = maxRange(arr, 1, 3);
        System.out.println(ans);

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(s);

    }

}
