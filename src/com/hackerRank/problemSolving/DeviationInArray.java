package com.hackerRank.problemSolving;

import java.util.*;

public class DeviationInArray {
    public static void main(String[] args) {

        int[] nums = {4,1,5,20,3};

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        int min = Integer.MAX_VALUE;

        for(int i : nums){
            if(i % 2 == 1) i *= 2;
            min = Math.min(min, i);
            pq.add(i);   //! all elements are added in pq
        }

        int diff = Integer.MAX_VALUE;
        while(pq.peek() %2 == 0){
            int max = pq.remove();
            diff = Math.min(diff, max-min);
            min = Math.min(min, max/2);
            pq.add(max/2);
        }

        System.out.println(Math.min(diff, pq.peek()-min));

    }
}
