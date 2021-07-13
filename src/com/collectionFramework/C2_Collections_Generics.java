package com.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class C2_Collections_Generics {

//*--------------------------------------------------------------------------------------
//        public static void main(String[] args) {
//        Collection values = new ArrayList();
//        values.add(2);
//        values.add("Satyam");
//        values.add(2.3f);

//?     ITERATOR is used to fetch the values from COLLECTIONS.
//?     This is very old techniques.
//        Iterator i = values.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//                }

//        for (Object i: values ) {
//            System.out.println(i);
//        }
//*--------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Collection<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);

        for (int i: values  ) {
            System.out.println(i);
        }
    }


    }
