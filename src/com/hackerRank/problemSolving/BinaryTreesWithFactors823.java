package com.hackerRank.problemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors823 {
    public static void main(String[] args) {
        int[] nums = {2,4,5,10};
        System.out.println(numFactoredBinaryTrees(nums));
    }

    public static int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for(int elem : arr) map.put(elem, 1);

        for (int i = 1; i < arr.length; i++) {
            int ways = 0;
            for (int j = 0; j < i; j++) {
                if((arr[j] % arr[i] == 0) && map.containsKey(arr[i] / arr[j])){
                    ways = map.get(arr[i]) + map.get(arr[j]) * map.get(arr[i] / arr[j]);
                    map.put(map.get(arr[i]), ways);
                }
            }

        }
        int res = 0;
        for(int x : map.values()) res += x;
        return res;
    }

}
