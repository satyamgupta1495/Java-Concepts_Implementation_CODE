package com.collectionFramework;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AC0_Collections_Queue {


    public static void main(String[] args) {

//?        Queue<Integer> qArray = new ArrayList<>();
                        //! OR
        Queue<Integer> qList = new LinkedList<>();
        {
                qList.offer(10);    //! This will not throw any error, only returns true or false.
                qList.add(1000);      //?  This will throw an error and may cause app to crash if failed to add.
                qList.offer(80);

            System.out.println(qList.remove()); //! Throws an exception
            System.out.println(qList.poll());   //? returns NULL

            System.out.println(qList.element()); //! This will throw an error and may cause app to crash.
            System.out.println(qList.peek());  //? This will not throw any error, only returns NULL if queue is empty.

            System.out.println(qList);
        }
    }
}
