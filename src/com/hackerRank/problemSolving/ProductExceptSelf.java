package com.hackerRank.problemSolving;

import java.util.Arrays;

public class ProductExceptSelf {

    static int[] product(int[] array){
        int n = array.length;

        int[] output_array = new int[n];
        output_array[0] = 1;

        for(int i = 1; i < n; i++){
        output_array[i] = output_array[i-1] * array[i-1];
        }
        //System.out.println(Arrays.toString(output_array));

        int R = 1;
        for (int i = n-1; i >= 0 ; i--) {
            output_array[i] = output_array[i] * R;
            //System.out.print(R + " ");
            R = R * array[i];
        }
        System.out.println();
        System.out.println(Arrays.toString(output_array));
        return output_array;
    }

    static int[] product2(int[] array){

        int n = array.length;
        int[] left = new int[n];
        int[] right= new int[n];
        int[] output_array = new int[n];

        left[0] = 1;
        right[n-1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i-1] *  array[i-1];
        }
        System.out.println(Arrays.toString(left) + " left");
        for (int i = n-2; i >= 0; i--) {
            right[i] = right[i+1] *  array[i+1];

        }
        System.out.println(Arrays.toString(right) + " right");
        for (int i = 0; i <n; i++) {
            output_array[i] = left[i] *  right[i];
        }

        System.out.println(Arrays.toString(output_array));


        return output_array;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        product(array);
        product2(array);
    }
}
