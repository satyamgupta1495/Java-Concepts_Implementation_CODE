package com.datastructure.sorttingAlgorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {38,52,9,18,6,62,13};
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
