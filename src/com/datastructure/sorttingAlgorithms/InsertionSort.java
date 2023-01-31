package com.datastructure.sorttingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    void inSort(int[] array)
    {
        int len = array.length;

        for (int i = 1; i < len ; i++)
        {

           int temp = array[i];
           int j = i-1;
           while(j >=0 && array[j] > temp)
           {
               array[j+1] = array[j];
                j--;
           }
           array[j+1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] array = {6, -1, -5,56,8, 2};

//        InsertionSort sort = new InsertionSort();
//        sort.printArray(array);
//        sort.inSort(array);
//        System.out.println();
//        sort.printArray(array);

        newInsertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void newInsertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr,j , j-1);
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
