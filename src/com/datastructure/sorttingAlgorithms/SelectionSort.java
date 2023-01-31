package com.datastructure.sorttingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {38, 52, 9, 18, 6, 62, 13};
//        inSort(array);

        newInsertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void newInsertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, lastIndex, maxIndex);
        }
    }



    private static int getMaxIndex(int[] arr, int start, int lastIndex) {
        int max = start;

        for (int i = start; i <= lastIndex; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


    static void inSort(int[] array){
            int min, temp = 0;

            System.out.print("Before Sorting -> ");
            for (int elem: array)
            {
                System.out.print(elem + " ");
            }
            System.out.println();
            for (int i = 0; i < array.length; i++)
            {

                min = i;
                for (int j = i+1; j < array.length; j++)
                {

                    if (array[j] < array[min])
                    {
                        min = j;
                    }
                }
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

            System.out.print("After Sorting -> ");
            for (int elem: array)
            {
                System.out.print(elem + " ");
            }


    }
}
