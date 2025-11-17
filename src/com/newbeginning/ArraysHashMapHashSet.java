package com.newbeginning;

import java.util.*;

public class ArraysHashMapHashSet {
    public static void main(String[] args) {
        System.out.println("============================ ARRAY ==========================================");
        int[] emptyArr = new int[5];
        int[] arr = new int[]{1, 21, 3, 8, 4, 89};
        int[][] arr2D = new int[][]{{1, 2}, {3, 4}};
        System.out.println(Arrays.toString(arr));
        System.out.println("Deep to string : " + Arrays.deepToString(arr2D));
        Arrays.sort(arr);
        System.out.println("Sort : " + Arrays.toString(arr));
        Arrays.fill(emptyArr, 9);
        System.out.println("Fill array : " + Arrays.toString(emptyArr));
        System.out.println("Binary search : " + Arrays.binarySearch(arr, 4));
        int[] copy = Arrays.copyOf(arr, 10);
        System.out.println("Copy of arr : " + Arrays.toString(copy));
        System.out.println("Arrays stream : " + Arrays.stream(copy).max().getAsInt());

        System.out.println("============================ ARRAY LIST ==========================================");

        List<String> list = new ArrayList<>();
        list.add("Lamborghini");
        System.out.println("List : " + list);

        list.add(0,"Lamborghini");          //? imp
        System.out.println("Add at index : " + list);

        list.add(0, "Ferrari");       //? imp
        System.out.println("Insert at index : " +  list);
        System.out.println("Get : " + list.get(0));

        list.set(1, "BMW");
        System.out.println("Set : " + list);

        System.out.println("Length / size : " + list.size());
        System.out.println("Contains : " + list.contains("BMW"));

        Collections.sort(list);          //? imp
        System.out.println("Sort uses { Collections } : " + list );

        Collections.reverse(list);           //? imp
        System.out.println("Reverse uses { Collections } : " + list );

        list.toArray();
        System.out.println("ToArray : " + list);
        System.out.println("Remove by index : " + list.remove(0));
        list.clear();            //? imp
        System.out.println("Clear : " + list);

        System.out.println("============================ HASH SET ==========================================");

        //? Basic function : Add, Contains, Remove, Size, Clear
        //* NOTE : addAll = UNION,
        //* NOTE : retainAll = INTERSECTION,
        //* NOTE : removeAll = DIFFERENCE

        List<Integer> dummyList = List.of(1,2,3,4,5,5,5,5,5,5);
        HashSet<Integer> set = new HashSet<>(dummyList); //? OR set.addAll(dummyList);
        System.out.println("Set : " + set);

        System.out.println("============================ HASH MAP ==========================================");

        HashMap<String, Integer> map = new HashMap<>();
        //? Basic function : put, get, remove, size

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        System.out.println(map);
        System.out.println("Get : " +  map.get("b"));
        System.out.println("Get or Default : " +  map.getOrDefault("x", -1));
        System.out.println("Contains key : " + map.containsKey("b"));
        map.replace("c", 1000);
        System.out.println("Replace : " + map);
        System.out.println("Keys only : " + map.keySet());
        System.out.println("Values only : " + map.values());
    }
}