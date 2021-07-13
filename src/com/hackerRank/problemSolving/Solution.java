package com.hackerRank.problemSolving;

import java.util.*;

public class Solution {

    public static int diagonalDifference1(List<List<Integer>> arr) {
        int leftdiagonal = 0, rightdiagonal = 0;
        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }
        return Math.abs(leftdiagonal - rightdiagonal);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int res1=0,res2=0,n=0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    list1.add((arr.get(i).get(j)));
//                        System.out.println(arr[i][j]);
                }
            }
        }
        for (int i = 0; i < arr.size() ; i++) {
            int start = 0, end = arr.size()-1;
            while(start<end){
                Collections.reverse(arr);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {

                if (arr.get(i) == arr.get(j)) {
                    list2.add(arr.get(i).get(j));
//                    System.out.println(arr[i][j]);
                }
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            res1 = res1 + list1.get(i);
            res2 = res2 + list2.get(i);
        }

        int finalres = res1-res2;
        // System.out.println(Math.abs(finalres));

        return Math.abs(finalres);
    }

    public static void main(String[] args) {
        Solution s = new Solution();

    }
}
