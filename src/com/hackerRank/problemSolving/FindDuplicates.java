package com.hackerRank.problemSolving;

public class FindDuplicates {

    static int findDup(int[] arr){

        int t = arr[0];
        int h = arr[0];

        do{
            t = arr[t];
            h = arr[arr[h]];
        }while(t!=h);

        t = arr[0];

        while(t !=h){
            t = arr[t];
            h = arr[h];
        }
        return t;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
        int ans = findDup(arr);
        System.out.println(ans);
    }
}
