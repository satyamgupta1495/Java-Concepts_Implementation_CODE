package com.datastructure.Heap;

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

//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

    }
}
