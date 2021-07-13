package com.Java_Place_Practice;

import java.util.ArrayList;

public class P14_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(20);

        l2.add(22);
        l2.add(11);
        l2.add(33);
        l2.add(44);
        l2.add(55);
        l1.add(10);
        l1.add(50);
        l1.add(40);
        l1.add(30);
        l1.add(20);
        l1.addAll(2,l2);



        l1.spliterator();



        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        System.out.println(l1.containsAll(l1));


    }
}
