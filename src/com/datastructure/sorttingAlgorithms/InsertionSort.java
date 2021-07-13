package com.datastructure.sorttingAlgorithms;

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

    void printArray(int[] array)
    {
        for (int elem : array )
        {
            System.out.print(elem + " ");
        }
    }


    public static void main(String[] args) {

        int[] array = {6, 1, 5, 2};

        InsertionSort sort = new InsertionSort();
        sort.printArray(array);
        sort.inSort(array);
        System.out.println();
        sort.printArray(array);



    }
}
