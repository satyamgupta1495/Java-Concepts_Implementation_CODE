package com.datastructure.sorttingAlgorithms;


public class BubbleSort {

    public void bubbleSort(int[] arr){
        int n = arr.length;
        boolean flag = false;

        //! Outer loop
        for (int i = 0; i < n-1 ; i++)
        {
            for (int j = 0; j < n-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }

    }

    public void printArray(int[] arr){
        for (int elem : arr ) {
            System.out.print(elem + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort(arr);
        bubble.printArray(arr);
    }
}
