package com.hackerRank.problemSolving;

import java.util.*;

public class KthLargestNumber {
    public static void main(String[] args) {

        int N = 5, K = 2;
        int [] arr = {12, 5, 787, 1, 23};
        int[] ans =  kLargest(arr,N, K);

    }

    static int[] kLargest(int[] arr, int n, int k) {
        int[] res = new int[k];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; ++i){
            pq.add(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(pq.poll()) ;
        }

        Collections.reverse(list);

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }


        System.out.println(list);
        System.out.println(Arrays.toString(res));
        return res;
    }
}
