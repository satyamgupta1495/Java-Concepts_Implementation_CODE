package com.satyamgupta;

import java.awt.*;
import java.util.*;
import java.util.List;

class container<T>{

    T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void array(ArrayList<? extends T> obj){

    };
}


public class Maps {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap(); //! Hash map is not synchronized.
        map.put("myName", "Satyam");    //! map.add in arrayList.
        map.put("Actor", "Tom cruise");
        map.put("CEO", "Elon Musk");

//      System.out.println(map); //? print value in random order.

        //! Printing....
//        Set<String> keys = map.keySet();
//        for(String key : keys) {
//            System.out.println(key + " " + map.get(key));
//        }


        //? We got Collection in java 1.2 and Generics in 1.5
        //? Collections doesn't works with index number hence we cannot add elements in between.


        //! Array is fast as compared to ArrayList(collections).
        Collection<Integer> c = new ArrayList<>();
        c.add(45);
        c.add(55);
//        c.add("Satyam");
        System.out.println(c);

        List<Integer> c1 = new ArrayList<>();  //! Can have duplicate values.
        c1.add(45);
        c1.add(55);
//        c.add("Satyam");
        System.out.println(c1);

        Set<Integer> set = new HashSet<>(); //! Cannot have duplicate values.
        Set<Integer> tree = new TreeSet<>(); //! Will give output in sorted format.

//        * List, Set, Collection, Map all are Interfaces.

        //! Generics

        container<Integer> con = new container<>();

        con.value = 0;
        con.show();
        con.array(new ArrayList<>());





    }
}
