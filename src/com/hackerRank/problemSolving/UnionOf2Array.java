package com.hackerRank.problemSolving;

import java.util.*;

public class UnionOf2Array {

    public static int doUnion(int a[], int b[]){
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], i);
        }
        for (int i = 0; i < b.length; i++) {
            map.put(b[i], i);
        }

        for (Map.Entry entry: map.entrySet()  ) {
            count++;
        }
        return count;

        }


    public static void main(String[] args) {

        int[] a = {85 ,25 ,1 ,32 ,54 ,6   };
        int[] b = {85,2};
        int ans = doUnion(a,b);
        System.out.println(ans);
    }
}
