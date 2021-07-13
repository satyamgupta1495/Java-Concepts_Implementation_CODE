package com.collectionFramework;

import java.util.*;


//? ARRAYS are fast as compared to collections but there sizes are fixed


public class C1_Collections_Concept {
    public static void main(String[] args) {


//?        This line will valid for every type of input! Like integer, float , string etc
        Collection values = new ArrayList<Integer>();
        values.add(23);
        values.add(78);
        values.add(456);
        System.out.println(values);

        values.remove(78);
        System.out.println(values);

//?     THIS IS GENERIC  i.e It'll take only specific type of value

        Collection<String> intValues = new ArrayList<>();
        intValues.add("Satyam");
        intValues.add("Delhi");
        intValues.add("Mumbai");
        System.out.println(intValues);

        intValues.remove("Satyam");
        System.out.println(intValues);

        System.out.println(intValues.getClass().getTypeName());



//*        What if you want to delete value which are in the middle ?

//?        List -> You can have duplicate Value + fetching element...It'll give values in order
//?        set -> You cannot have duplicate value  +  fetching element... It'll give values at random

        Set<Integer> setNum = new HashSet<>();         //! Cannot use same values it gives Unique value everytime.

        Set<Integer> sortedNum = new TreeSet<>();         //! Always give values in sorted manner

        List<String> listNum = new ArrayList<>();   //! Can use same values.

//?     Map<key,Value> mapNum = new HashMap<>();    //! It will give output only when key and values will matched
        Map<Integer,String> mapNum = new HashMap<>();    //! It will give output only when key and values will matched


    }
}
