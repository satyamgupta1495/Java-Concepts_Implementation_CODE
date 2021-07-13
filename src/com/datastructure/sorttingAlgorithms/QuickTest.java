package com.datastructure.sorttingAlgorithms;

public class QuickTest {


    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[(low+high)/2];
        while(low <= high)        //! mistake 1 -> low<=high
        {
            while(arr[low] < pivot)
            {
                low++;
            }
            while(arr[high] > pivot)
            {
                high--;
            }
            if (low <= high)      //! mistake 2
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high++;
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

    void printArray(int[] arr)
    {
        for (int elem:arr) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {18,2,4,7,18,17,6,40,19};
        int n = arr.length;

        QuickTest sort1 = new QuickTest();
        sort1.quickSort(arr,0,n-1);
        sort1.printArray(arr);

    }
}
