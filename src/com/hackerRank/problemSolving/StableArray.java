package com.hackerRank.problemSolving;

import java.util.*;

//Input : a[] = {4,3,1,3,1,2}
//        Output :  2
//        Explanation : If we remove 1st and last element from
//        the given array, then the array will be stable
//        resultant array: 3 1 3 1 (every element occure only 2 ti
public class StableArray {
    public static void main(String[] args) {
       int a[] = {1,1,2,4,1,2,2};
       stable(a);
    }

    static void stable(int[] arr){
       HashMap<Integer, Integer> map = new HashMap<>();
       int count = 0 ;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1){
                map.remove(arr[i]);
                count++;
            }
        }

        int initial = map.get(arr[0]);
        for (int i = 0; i < map.size(); i++) {

        }

        System.out.println(count);
        System.out.println(map);
    }
}
