package com.datastructure.Recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void selectSort(int[] array, int n)
    {
        if(n <= 0) return;
        else
        {
            selectSort(array, n-1);

            int min = n;


            if (array[min] < array[min])
                min = min+1;

            int temp = array[min+1];
            array[min+1]  = array[min];
            array[min] = temp;



        }
    }

    public static void main(String[] args) {

        int arr[] = {3,5,8,54845,1,848,2,1};
        System.out.println(Arrays.toString(arr));

        SelectionSort sort = new SelectionSort();
        sort.selectSort(arr, arr.length);


        System.out.println(Arrays.toString(arr));


    }
}
