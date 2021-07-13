package com.collectionFramework;

import java.util.ArrayList;

//! Diff btwn ArrayList and Vectors

//*---------------ArrayList------------
//?     1-Increases the Capacity of list by 50%
//?     2-Fast
//?     3-Not Threadsafe

// *---------------Vector------------
//?     1-Increases the Capacity of list by 100%
//?     2-Slow
//?     3-Threadsafe





public class C4_Collections_Vector_vs_List {
    public static void main(String[] args) {

//        Vector<Integer> v = new Vector<>(); // increases the capacity by 100% // syncronized //Not threadsafe //fast
        ArrayList<Integer> v = new ArrayList<>();  // Increases the capacity by 50%. //not-Syncronized  // Threadsafe //slow

        v.add(19999);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);
        v.add(80);
        v.add(90);

        System.out.println("Capacity is : " + v.size());
        for (int i: v) {
            System.out.println(i);
        }
    }
}
