package com.datastructure.Recursion;

import java.util.Arrays;

public class ReverseArray {

    void reverse(int[] array, int i)
    {
        if (i >= array.length/2) return;
        else
        {
           int temp = array[i];
           array[i] =array[array.length-i-1];
            array[array.length-i-1] = temp;
            reverse(array,i+1);
        }

    }

    public static void main(String[] args) {

        int arr[] = {3,5,8,54845,1,848,2,1};
        System.out.println(Arrays.toString(arr));

        ReverseArray reverse1 = new ReverseArray();
        reverse1.reverse(arr,0);
        System.out.println(Arrays.toString(arr));

    }
}
