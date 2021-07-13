package com.collectionFramework;

import java.util.Arrays;

public class AC5_Collections_ArraysClass {

    public static void main(String[] args) {

        int[] arr = {1,8,63,7,5,9,7,14};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,7);
        System.out.println(index);

        Arrays.fill(arr,1);
        for (int elem: arr) {

        System.out.println(elem);
        }


    }
}
