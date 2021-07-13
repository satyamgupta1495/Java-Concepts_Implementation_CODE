package com.collectionFramework;

import java.util.*;
import java.util.Map.Entry;

public class Mainclass {

    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("ONE",1);
        numbers.put("TWO",2);
        numbers.put("THREE",3);

        numbers.putIfAbsent("ONE",100);

        numbers.get("TWO");


        //System.out.println(numbers.containsKey("TWoO"));

        numbers.remove("TWO");  //! Removed 2
        System.out.println(numbers);

        System.out.println(numbers.keySet());
        System.out.println(numbers.values().getClass());

        for (Entry<String, Integer> entry: numbers.entrySet()  ) {
           int a =  entry.getValue() * 1000;
            System.out.println(a);

                    }


        Set<Entry<String,Integer>> entries = numbers.entrySet();

        for (Entry<String, Integer> entry :  entries)
        {

            entry.setValue(entry.getValue()*100);
        }
        System.out.println(numbers);
    }





}

