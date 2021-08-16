package com.hackerRank.problemSolving;

import java.util.*;


public class Divisible_Sum_Array {

    //? O(n^2)
    int sumArrayItter(int n, int k, int[] arr){
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(i != j && (arr[i] + arr[j]) % k == 0){
                    count++;
                }
            }
        }
        return count;
    }

    //? Optimized
    int sumArray(int n, int k, int[] ar) {
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int values:ar ) {
            int mod = values % k;
            int comp = k - mod == k ? 0 : k-mod;

            if(map.containsKey(comp))
                count += map.get(comp);
            if (map.containsKey(mod)){
                map.put(mod, map.get(mod) + 1);
            }
            if (!map.containsKey(mod)){
                map.put(mod, 1);
            }
        }
        return count;
    }


    public static void main (String[]args){
        int[] arr = {1, 3, 2, 6, 1, 2};

        Divisible_Sum_Array array = new Divisible_Sum_Array();

        System.out.println(array.sumArrayItter(6,3,arr));
        System.out.println(array.sumArray(6,3,arr));


    }
}
