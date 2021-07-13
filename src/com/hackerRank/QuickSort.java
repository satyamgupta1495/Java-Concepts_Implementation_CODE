package com.hackerRank;

public class QuickSort
{

    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[(low+high) / 2 ];
        System.out.println("pivit = " + pivot);


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

            if(low <= high)
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
        System.out.println(result + " result");
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
        for (int elem : arr)
        {
            System.out.print(elem + " ");
        }
    }




    public static void main(String[] args)
    {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int n = arr.length;

        System.out.println("asbdha");
        QuickSort sort1 = new QuickSort();
        sort1.quickSort(arr,0,n-1);
        sort1.printArray(arr);


    }
}