package com.hackerRank.problemSolving;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    void diff(int[][] arr) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int res1=0,res2=0,n=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        list1.add((arr[i][j]));
//                        System.out.println(arr[i][j]);
                    }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            int start = 0, end = arr.length-1;
            while(start<end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                n++;
                if (arr[i] == arr[j]) {
                    list2.add((arr[i][j]));
//                    System.out.println(arr[i][j]);
                }
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            res1 = res1 + list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            res2 = res2 + list2.get(i);
        }
        int finalres = res1-res2;
        System.out.println(Math.abs(finalres));

        }


    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{9,8,9}};
    DiagonalDifference d = new DiagonalDifference();
    d.diff(arr);
    }
}
