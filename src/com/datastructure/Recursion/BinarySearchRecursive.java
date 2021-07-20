package com.datastructure.Recursion;

public class BinarySearchRecursive {

    int binarySearch(int arr[], int l, int r, int x){

        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }



    public static void main(String[] args) {

//        int[] array = {3,5,8,545,1,848,20,1};
        int[] array = {1,2,3,45,6,7,8,9};
        BinarySearchRecursive bin = new BinarySearchRecursive();
        int res = bin.binarySearch(array,0, array.length-1,8);
        System.out.println(res);

    }
}
