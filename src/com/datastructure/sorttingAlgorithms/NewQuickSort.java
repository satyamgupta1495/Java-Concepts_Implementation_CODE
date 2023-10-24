package com.datastructure.sorttingAlgorithms;

public class NewQuickSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        for (int elem : arr ) {
            System.out.print(elem + " ");
        }
    }

    static  void sort(int[] arr, int lo, int hi){

        if (lo >= hi) return;
        int s = lo;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while(s <= e){
            while(arr[s] < pivot){
                ++s;
            }
            while(arr[e] > pivot){
                --e;
            }

            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                --e;
            }


        }
        sort(arr, lo, e);
        sort(arr, s, hi);
    }

}
