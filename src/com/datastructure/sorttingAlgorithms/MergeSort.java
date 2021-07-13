package com.datastructure.sorttingAlgorithms;

public class MergeSort
{

    void merge(int[] array, int start, int mid, int end)
    {

        int[] tempArray = new int[end - start +1];

        // crawlers

        int i = start;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= end)
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

        while(i <= mid)
        {
            tempArray[k] = array[i];
            k++;
            i++;
        }

        while(j <= end)
        {
            tempArray[k] = array[j];
            k++;
            j++;
        }

        for (i = start; i <= end ; i++ )
        {
            array[i] = tempArray[i-start];
        }


    }

    void mergeSort(int[] array, int start, int end)
    {
        if (start < end) {
            int mid = (start + end) /2;
            mergeSort(array, start, mid);
            mergeSort(array,mid+1, end);
            merge(array, start, mid, end);
        }
    }

    void printArray(int[] array)
    {
        for (int elem : array )
        {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args)
    {

        int[] array = {9,8,7,6,5,4,3,2,1};

        MergeSort msort = new MergeSort();
        msort.printArray(array);
        System.out.println();
        msort.mergeSort(array, 0, array.length-1);
        msort.printArray(array);

    }
}