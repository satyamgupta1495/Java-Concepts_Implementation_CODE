package com.collectionFramework;

import java.util.*;


public class C6_Collections_Maps {
    public static void main(String[] args) {

//        Map<String, Integer> map = new HashMap();
//
//
//        map.put("One" , 1);
//        map.put("Two" , 2);
//        map.put("Three" , 3);
//        map.put("Four" , 4);
//        map.put("Five" , 5);
//
//        System.out.println(map);

        Map<String, String> map = new HashMap();
/*        Map<String, String> map = new HashMap();

        map.put("Name", "Satyam");
        map.put("LastName", "Gupta");
        map.put("Roll.no", "281812");

        System.out.println(map);
//        System.out.println(map.get("Roll.no"));

//?      Now I want to print all the key and there values but how would I knw how many key are present in the sets?

        Set<String> keyset = map.keySet();

//        for (String element: keyset ) {
//            System.out.println(element +" " +map.get(element));
//        }


//?        Entry is a interface inside Map interface
//?        what is entry -> key & value pair.

       Set<Map.Entry<String,String>> values = map.entrySet();
        for (Map.Entry<String,String> elements: values   ) {
            System.out.println(elements.getKey() + " " + elements.getValue());
            elements.setValue("111");
        }

 */
//!--------------------------------------------------------------------------------------------------------------------------

        Set<Map.Entry<String,String>> values = map.entrySet();
        for (Map.Entry<String,String> elements: values   ) {
            System.out.println(elements.getKey() + " " + elements.getValue());
            elements.setValue("111");
        }
        //! Key k according Sort karega [Dictonary Order for String]
        //? Complecxity O(log n)
        Map<String, Integer> tree = new TreeMap<>();
        tree.put("One" , 1);
        tree.put("Two" , 2);
        tree.put("Three" , 3);
        tree.put("Four" , 4);
        tree.put("Five" , 5);

            System.out.println("Tree " + tree);


    }
}
