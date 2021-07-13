package com.satyamgupta;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

//!        numbers.put("Key", Valuepair);

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);


        numbers.put("Three", 19);           //* UPDATE KAR DETA HAI

        numbers.putIfAbsent("One", 88);

//        System.out.println(numbers);

//        System.out.println(numbers.get("One"));

//        !CHECK VALUE PRESENT HAI YA NHI
//        System.out.println(numbers.containsKey("One"));
//        System.out.println(numbers.containsValue(7));
//
////        !REPLACE KARNE K LIYE VALUE KO
//        System.out.println(numbers.replace("One",1,88));
//        System.out.println(numbers);
//
////        !VALUE REMOVE KARNE K LIYE
//        numbers.remove("Two",2);
//        System.out.println(numbers);


//        System.out.println(numbers.keySet());
//        System.out.println(numbers.values());


//        Set<Entry<String, Integer>> entries = numbers.entrySet();
//        for (Entry<String, Integer> entry: entries) {
//            entry.setValue(entry.getValue()*100);
//        }
//        System.out.println(numbers);


//!     HASH CODE GENERATOR--------------- BEGIN HERE
//        System.out.println(getHash("CAT"));
//
//    }
//    public static int getHash(String s) {
//        int hash = 0;
//        for (int i = 0; i < s.length(); i++) {
//            hash += s.charAt(i);
//        }
//        return hash;
//    }
// !     HASH CODE GENERATOR--------------- ENDS HERE


    }
}

