package com.collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//! Set is implemented by -> HashSet, LinkedSet, TreeSet

//? methods -> add, remove, size, clear, contains, and isEmpty()

public class AC3_Collections_Sets {
    public static void main(String[] args) {

        //! No order is maintained in SET
        //? Jo order mein insert hoga element zaroori nhi usi order mein print ho.
        Set<Integer> set = new HashSet<>();

        set.add(11);
        set.add(22);
        set.add(33);
        set.add(44);
        System.out.println("HASH-SET -> " + set);

/*
        set.remove(42);
        System.out.println("Removed " + 42);
        System.out.println(set);
*/

//!---------------------------------------------------------------------------------------------

        //! Order is maintained in LinkedHashset
        //? Jis Order mein daloge usi order mein value print hoga.

        Set<Integer> lHashSet = new LinkedHashSet<>();

        lHashSet.add(1);
        lHashSet.add(2);
        lHashSet.add(3);
        lHashSet.add(4);
        System.out.println("LINKED-HASHSET -> " + lHashSet);

//!---------------------------------------------------------------------------------------------

        //! Sorted Order mein value print hoga
        //? Implements binary search tree hence COMPLEXITY = O(log n);

        Set<Integer> tSet = new TreeSet<>();
        tSet.add(78);
        tSet.add(6);
        tSet.add(7);
        tSet.add(64);
        System.out.println("Tree-Set -> "+ tSet);

        set.contains(2);
        for (int val:set) {

        }




    }
}
