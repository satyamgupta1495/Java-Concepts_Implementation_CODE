package com.hackerRank.problemSolving;

public class DutchNationalFlag {
    static int[] swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
    static void sort(int[] a) {
        int lo = 0;
        int mid = 0;
        int hi = a.length-1;

        while(mid<=hi){
            switch(a[mid]){
                case 0: {
                    swap(a, lo, mid);
                    lo++;
                    mid++;
                    break;                      //! Break is imp
                }

                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(a, mid, hi);
                    hi--;               //! Dont increment mid
                    break;
                }
            }
        }

        for (int val:a  ) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {

        int arr[]= { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(arr);
    }
}
