package com.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AC1_Collections_ArrayList {
    public static void main(String[] args) {

        //? Here all the methods ill be same as ArrayList and LinkedList both are implementing List.
        //! List<Integer> linkedList = new LinkedList<>();

        List<Integer> list = new ArrayList<Integer>( );
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(1,100);

        List<Integer> list2 = new ArrayList<Integer>( );
        list2.add(130);
        list2.add(220);
        list2.add(107);


        list.addAll(1,list2);

        System.out.println(list.contains(110));

        //! This is a class "s" hai last mein.
//        Collections.sort(list);


        System.out.println(list);

        System.out.println(list.contains(77));

        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(list);
        finalList.add(list2);
        System.out.println(finalList);


//*       list.forEach(System.out::println);  //?Stream API : Lambda Expression

    }
}
