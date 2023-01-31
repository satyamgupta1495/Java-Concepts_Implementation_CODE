package com.hackerRank.problemSolving;

//! https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/

import java.util.Arrays;
import java.util.PriorityQueue;

public class TheKWeakestRowsMatrix {

    public static void main(String[] args) {

        int[][] arr = { {1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1}};
        int k = 3;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] != b[0] ? b[0]-a[0] : b[1]-a[1]);

        int[] res = new int[k];
        for (int i = 0; i < arr.length; i++) {
            int sol = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) sol++;
                else break;
            }
            pq.offer(new int[] {sol,i});
        }

        while(pq.size() > k) pq.poll();
        while (k > 0) res[--k] = pq.poll()[1];

        System.out.println(Arrays.toString(res));

    }


}
