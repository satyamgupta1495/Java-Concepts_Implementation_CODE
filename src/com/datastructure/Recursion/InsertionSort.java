package com.datastructure.Recursion;

import com.satyamgupta.Array;

import java.util.Arrays;

public class InsertionSort {

    public void inSort(int[] array, int n)
    {
       //! base case
        if (n <= 1)
        {
//            System.out.println(n + "<-");
            return ;
        }
       else {
            //! driver code
//            System.out.println("Val of n in else = " + n);

            inSort(array, n - 1);

            int last = array[n-1];
            int j = n-2;

                while (j >= 0 && array[j] > last) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = last;
        }

    }

    public static void main(String[] args) {

        int arr[] = {3,5,8,54845,1,848,2,1};
        System.out.println(Arrays.toString(arr));

        InsertionSort sort = new InsertionSort();
        sort.inSort(arr, arr.length);


        System.out.println(Arrays.toString(arr));

    }
}
