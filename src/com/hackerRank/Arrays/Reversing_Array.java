package com.hackerRank.Arrays;


public class Reversing_Array {

        static void reverse(int a[], int n){
            int[] b = new int[n];
            int j = n;
            for (int i = 0; i < n; i++) {
                b[j-1] = a[i];
                j -= 1;
            }

            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
            }

        }




    public static void main(String[] args) {

        int[] arr = {4,3,2,1};
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }

        System.out.println("---------------------");
        Reversing_Array reverse = new Reversing_Array();
        reverse.reverse(arr,4);



    }
}
