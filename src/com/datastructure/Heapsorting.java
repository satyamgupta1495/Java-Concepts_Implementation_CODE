package com.datastructure;

import com.datastructure.sorttingAlgorithms.HeapSort;

public class Heapsorting {

    void heapSort(int[] array)
    {
        int n = array.length;

        for (int i = n/2-1; i >= 0 ; i--)
            heapify(array, n, i);

        for (int i = n-1; i >=0 ; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    void heapify(int[] array, int n, int i)
    {
        int largest = i;
        int left_child = 2*i+1;
        int right_child = 2*i+2;

        if (left_child < n && array[left_child] > array[largest])
            largest = left_child;

        if (right_child < n && array[right_child] > array[largest])
            largest = right_child;

        if (largest != i)
        {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
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

        int[] array = {9,8,7,6,5,43,2,1};

        Heapsorting sort = new Heapsorting();
        sort.heapSort(array);
        sort.printArray(array);

    }
}
