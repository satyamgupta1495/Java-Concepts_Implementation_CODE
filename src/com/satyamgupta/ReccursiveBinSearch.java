package com.satyamgupta;

public class ReccursiveBinSearch {

    //! Sorted Array
    int reccursiveBinSearch(int[] array, int lb, int ub, int key)
    {
        int mid = (lb+ub)/2;
        if (array[mid] == key && ub >= lb) return mid;

        if (array[mid] < key) return reccursiveBinSearch(array,mid+1,ub, key);
        else return reccursiveBinSearch(array, lb, mid-1, key);

    }

    public static void main(String[] args) {

        int[] array = {12,24,36,41,58,67,89,400};
        ReccursiveBinSearch search = new ReccursiveBinSearch();
        int res = search.reccursiveBinSearch(array, 0, array.length-1, 400);
        System.out.println(res);
    }

}
