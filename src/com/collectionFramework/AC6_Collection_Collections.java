package com.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AC6_Collection_Collections {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(2);
        list.add(63);
        list.add(47);
        list.add(96);
        list.add(4);
        list.add(78);

        System.out.println("Original List");
        System.out.println(list);
        System.out.println();

        System.out.println("Min elem -> "+Collections.min(list));
        System.out.println("Max elem -> "+Collections.max(list));

        //! Ascending Order Sorting
        Collections.sort(list);
        System.out.println();
        System.out.println("Ascending Order Sorting");
        System.out.println(list);

        //! Descending Order Sorting
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println();
        System.out.println("Descending Order Sorting");
        System.out.println(list);

    }
}
