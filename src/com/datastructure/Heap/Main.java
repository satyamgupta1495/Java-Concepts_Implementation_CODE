package com.datastructure.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.insert(32);
        heap.insert(56);
        heap.insert(11);
        heap.insert(88);
        heap.insert(89);
        heap.insert(33);

        System.out.println(heap.heapSort());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(22);
        pq.add(33);
        pq.add(11);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }



//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

    }
}
