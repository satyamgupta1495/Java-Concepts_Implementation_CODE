package com.datastructure.sorttingAlgorithms;

public class QuickSort {

    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[(low+high)/2];
        while(low <= high)
        {
            while(arr[low] < pivot)
            {
                low++;
            }
            while(arr[high] > pivot)
            {
                high--;
            }
            if (low <= high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    void quickSort(int[] arr, int low, int high)
    {
        int result = partition(arr, low, high);
        if (low < result-1)
        {
            quickSort(arr, low, result-1);
        }
        if (result < high)
        {
            quickSort(arr, result, high);
        }
    }

    void print(int[] arr)
    {
        for (int i:arr   ) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {18,2,4,7,18,17,6,40,9};
        int n = arr.length;

        QuickSort sort = new QuickSort();
        sort.quickSort(arr,0,n-1);
        sort.print(arr);

    }
}
