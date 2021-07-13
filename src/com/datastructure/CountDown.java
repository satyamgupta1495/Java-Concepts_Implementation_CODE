package com.datastructure;

import java.util.Arrays;

public class CountDown {
    public static void main(String[] args) {

        int[] arr = {1,5,7,9,6,7,3,2,1,7,8,59,4};

        Arrays.sort(arr);
        for (int elem: arr  ) {
            System.out.println(elem);
        }
//        int[] k = {3,2,1};
//        int ans_counter = 0;
//        int decreasing_counter = 0;
//
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] == arr[i -1] - 1){
//                decreasing_counter = decreasing_counter + 1;
//            }
//            else{
//                decreasing_counter = 0 ;
//            }
//
//            if (arr[i] == && decreasing_counter >= k[i]-1){
//                ans_counter = ans_counter+1;
//            }
//        }

    }
}
