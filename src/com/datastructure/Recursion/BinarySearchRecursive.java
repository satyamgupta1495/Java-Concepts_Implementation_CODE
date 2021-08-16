package com.datastructure.Recursion;

public class BinarySearchRecursive {

    //! Sorted Array
    int reccursiveBinSearch(int[] array, int lb, int ub, int key)
    {
        int mid = array[(lb+ub)/2];
        if (array[mid] == key) return mid;

        if (array[mid] < key) return reccursiveBinSearch(array,mid+1,ub, key);
        else return reccursiveBinSearch(array, lb, mid-1, key);


    }


    public static void main(String[] args) {

//        int[] array = {3,5,8,545,1,848,20,1};
        int[] array = {1,2,3,4,6,7,8,90};
        BinarySearchRecursive bin = new BinarySearchRecursive();
        int res = bin.reccursiveBinSearch(array,0, array.length-1,90);
        System.out.println(res);

    }
}
