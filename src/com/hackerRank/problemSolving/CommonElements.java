package com.hackerRank.problemSolving;

import java.util.*;

public class CommonElements {

    ArrayList<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {

        //! Time complexity = O(N^3);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k] && !list.contains(arr1[i])) {
                        list.add(arr1[i]);
                    }
                }
            }
        }

        return list;
    }

    void fastCommonElements(int[] arr1, int[] arr2, int[] arr3) {

    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    HashSet<Integer> set3 = new HashSet<>();

        for (Integer n:arr1 ) {
            set1.add(n);
        }
        for (Integer n:arr2 ) {
            set2.add(n);
        }
        for (Integer n:arr3 ) {
            set3.add(n);
        }

        set1.retainAll(set2);
        set1.retainAll(set3);

        int[] res = new int[set1.size()];
        int i = 0;
        for (int n:set1 )  res[i++] = n ;




        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        System.out.println();

        System.out.println(Arrays.toString(res));

    }



    public static void main(String[] args) {

//        int[] arr1 = {1, 5, 10, 20, 40, 80};
//        int[] arr2 = {6, 7, 20, 80, 100};
//        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
//
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};

        ArrayList<Integer> list = new ArrayList<>();




        CommonElements elem = new CommonElements();
        elem.fastCommonElements(arr1, arr2, arr3);
//        System.out.println(list);


    }

}
