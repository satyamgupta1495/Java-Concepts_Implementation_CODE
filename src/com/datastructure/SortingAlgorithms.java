package com.datastructure;

public class SortingAlgorithms {

    //todo -> 1- QUICK SORT            ✔
    //todo -> 2- MERGE SORT            ✔
    //todo -> 3- INSERTION SORT        ✔
    //todo -> 4- SELECTION SORT        ✔
    //todo -> 5- BUBBLE SORT

    int partition(int[] array, int low, int high)
    {
        int pivot = array[(low+high)/2];
        while(low <= high)
        {
            while(array[low] < pivot)
            {
                low++;
            }
            while (pivot < array[high])
            {
                high--;
            }
            if (low <= high)
            {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    void quickSort(int array[], int low, int high)
    {
        int res = partition(array, low, high);

            if (low < res-1)
            {
                quickSort(array,low,res-1);
            }
            if (res < high)
            {
                quickSort(array, res, high);
            }

    }

    void merge(int[] array, int start,int mid, int end)
    {
        //! making a Temperoary array.
        int[] tempArray = new int[end-start + 1];

        //! crawlers for 2 array [spited array]
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <=end)
        {
            if (array[i] < array[j])
            {
                tempArray[k] = array[i];
                i++;
            }
            else
            {
                tempArray[k] = array[j];
                j++;
            }
            k++;
        }

        //! Printing the remaining array as it is;
        while(i <= mid)
        {
            tempArray[k] = array[i];
            i++;
            k++;
        }

        //! Printing the remaining array as it is;
        while(j <= end)
        {
            tempArray[k] = array[j];
            j++;
            k++;
        }

        //! Writing back the the original array with values of temp array
        for (i = start; i <= end; i++)
        {
            array[i] = tempArray[i-start];
        }
    }

    void mergeSort(int[] array, int start, int end)
    {
        if (start < end)
        {
            int mid = (start + end)/2;
            mergeSort(array, start, mid);
            mergeSort(array,mid+1, end);
            merge(array, start, mid, end);
        }
    }

    void selectionSort(int[] array)
    {
        int min, temp = 0;
        for (int i = 0; i < array.length; i++)
        {
            min = i;
            for (int j = i+1; j < array.length ; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    void insertionSort(int[] array)
    {

        for (int i = 1; i < array.length; i++)
        {
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j] > temp)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }


    void printArray(int array[])
    {
        for (int elem: array )
        {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {

        int[] array = { 10, 7, 8, 9, 1, 5 };
        int n = array.length;

        SortingAlgorithms sortAlgo = new SortingAlgorithms();
        sortAlgo.printArray(array);
        System.out.println();

        //? sortAlgo.mergeSort(array, 0, n-1);
        //? sortAlgo.selectionSort(array);
        sortAlgo.insertionSort(array);
        sortAlgo.printArray(array);

    }
}
