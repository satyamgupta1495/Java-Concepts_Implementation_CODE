package com.datastructure;

import static java.lang.Math.max;

class Result{
    static  int ans(int arr[]){
        int max_l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                int current_length = 1;
                int r = i + 1;
                while(arr[r] != 0){
                    ++ current_length;
                    ++ r;

                }
                max_l = max(max_l, current_length);
            }

        }
        return max_l;
    }
}


public class Longest1 {
    public static void main(String[] args) {
//        int[] arr = {0,1,0,1,0,1,1,1,1,1,1,0};
//        System.out.println(Result.ans(arr));


    }
}
