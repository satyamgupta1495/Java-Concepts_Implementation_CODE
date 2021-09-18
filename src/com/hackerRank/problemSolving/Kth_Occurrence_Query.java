package com.hackerRank.problemSolving;
import java.util.*;

public class Kth_Occurrence_Query {

    ArrayList<Integer> countOccurrence(int[] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map.entrySet());



        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int elem: map.values()) {
            pq.add(elem);
            if (pq.size() > k){
                pq.poll();
            }
        }
        System.out.println(pq.poll());






//        System.out.println(map.entrySet());

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 4, 4, 5, 5, 5, 5, 5, 7, 7, 8, 8, 8, 8};
        Kth_Occurrence_Query query = new Kth_Occurrence_Query();
        query.countOccurrence(arr,2);

    }
}
