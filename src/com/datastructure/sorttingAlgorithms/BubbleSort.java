package com.datastructure.sorttingAlgorithms;


public class BubbleSort {

    public void bubbleSort(int[] arr){
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n ; i++)
        {
            for (int j = 1; j < n-i; j++)
            {
                if (arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;   //if no swap occurred for any particular value of i then BREAK
        }

    }

    public void printArray(int[] arr){
        for (int elem : arr ) {
            System.out.print(elem + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort(arr);
        bubble.printArray(arr);
    }
}
