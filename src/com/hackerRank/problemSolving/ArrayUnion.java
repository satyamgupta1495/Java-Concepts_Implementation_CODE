package com.hackerRank.problemSolving;

import java.util.*;

public class ArrayUnion {

    static int doUnion(int a[], int n, int b[], int m)
    {
        int count = 0;
        for(int i = 0; i <= n-1; i++){
            for(int j =0; j<=m-1; j++){
                if(a[i] == b[j]){
                    count++;

                    System.out.println(a[i]);
                    System.out.println(a[j]);
                }
            }
        }

        return count;
    }

    // Better approach

    static int doBetterUnion(int a[], int n, int b[], int m){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            map.put(a[i], i);
        }
        for (int i = 0; i < m; i++) {
            map.put(b[i], i);
        }

        for (int elem:map.values() ) {

            count++;
        }


        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,3,4,5};
        int[] arr2 = {8,7,6,4,5};
        int ans = doBetterUnion(arr1,5,arr2,5);
        System.out.println(ans);
    }
}
