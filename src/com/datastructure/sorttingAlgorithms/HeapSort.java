package com.datastructure.sorttingAlgorithms;

public class HeapSort {

    void heapSort(int[] array)
    {
        int n = array.length;

        //! Building HEAP (rearranging the array)
        for (int i = n/2-1 ; i >= 0 ; i--)
            heapify(array, n ,i);
        //? ^ bhai sabb proerty heap k follow hoo rhe hai na? ye check krta hai
        //! Heapify:- A process which helps regaining heap properties

        //! Removing one element ata a time from last
        for (int i = n-1; i >=0 ; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    //! To heapify a subtree rooted with node i which is
    //! an index in arr[]. n is size of heap

    void heapify(int[] array, int n, int i)
    {
        int largest = i;
        int left_child = 2 * i +1;
        int right_child = 2 * i +2;

        if (left_child < n && array[left_child] > array[largest])
        {
            largest = left_child;
        }

        if (right_child < n && array[right_child] > array[largest])
        {
            largest = right_child;
        }

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

        HeapSort sort = new HeapSort();
        sort.heapSort(array);
        sort.printArray(array);
    }
}
