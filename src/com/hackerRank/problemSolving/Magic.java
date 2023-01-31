package com.hackerRank.problemSolving;

import java.util.*;


public class Magic {
    public static void main(String[] args) {
        int[] arr = {3,5,7,3,1,78};
//        int[] arr = {325, 569, 783, 11, 376, 701, 808, 564, 451, 998, 905, 211, 316, 753, 501, 627};
        System.out.println(solve(arr, 1));
    }

    static int solve(int[] arr, int b){
        int max = getMax(arr);

        if (!isEqual(arr)){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < max) {
                    while (arr[i] < max) {
                        arr[i] += b;
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
        }

        return isEqual(arr) ? 1 : 0;
    }

    public static boolean isEqual(int[] arr)
    {
        Integer[] newArray = new Integer[arr.length];

        Arrays.setAll(newArray, i -> arr[i]);
        // Put all array elements in a HashSet
        Set<Integer> s = new HashSet<>(Arrays.asList(newArray));

        // If all elements are same, size of
        // HashSet should be 1. As HashSet contains only distinct values.
        return (s.size() == 1);
    }

    static int getMax(int[] arr){
        int max = arr[0];

        for (int i: arr ) {
            if (i > max){
                max = i;
            }
        }
        return max;
    }
}
