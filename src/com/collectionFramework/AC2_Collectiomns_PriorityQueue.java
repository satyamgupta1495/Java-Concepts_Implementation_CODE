package com.collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class AC2_Collectiomns_PriorityQueue {

    public static void main(String[] args) {

        //! Comparator.reverseOrder() -> MaxHeap Implement kr rha hai;

        Queue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        pQueue.offer(25);
        pQueue.offer(17);
        pQueue.offer(51);
        pQueue.offer(77);
        pQueue.offer(91);

        System.out.println(pQueue);

        pQueue.poll();
        System.out.println(pQueue);

        System.out.println(pQueue.peek());
    }

}
