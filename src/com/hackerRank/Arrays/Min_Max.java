package com.hackerRank.Arrays;
public class Min_Max {

    static void minMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];

            }
            else if(max < arr[i]){
                 max = arr[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,91,10};

        Min_Max m = new Min_Max();
        minMax(arr);
    }
}
