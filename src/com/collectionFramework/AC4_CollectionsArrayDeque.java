package com.collectionFramework;

//! Array Deque is used in sliding window technique
//? This implements a queue in which elements can be inserted from START and END and all the operations can be performed as well.

import java.util.ArrayDeque;

public class AC4_CollectionsArrayDeque {


    public static void main(String[] args) {

        ArrayDeque<Integer> aDeque = new ArrayDeque<>();

        aDeque.offer(111);
        aDeque.offerFirst(555);
        aDeque.offerLast(11);
        System.out.println(aDeque);

        System.out.println();

        //! PEEK
        System.out.println("Normal Peek ->" + aDeque.peek());
        System.out.println("Peek First ->" + aDeque.peekFirst());
        System.out.println("Peek Last ->" + aDeque.peekLast());

        System.out.println();

        //! POLL
        System.out.println("Normal Poll ->" + aDeque.poll());
        System.out.println(aDeque);
        System.out.println("Poll First ->" + aDeque.pollFirst());
        System.out.println(aDeque);
        System.out.println("Poll Last ->" + aDeque.pollLast());
        System.out.println(aDeque);

    }
}
