package com.hackerRank.problemSolving;

//! https://leetcode.com/problems/interval-list-intersections/

/*
 You are given two lists of closed intervals, firstList and secondList,
 where firstList[i] = [starti, endi] and secondList[j] = [startj, endj].
 Each list of intervals is pairwise disjoint and in sorted order.

 Return the intersection of these two interval lists.

 A closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.

 The intersection of two closed intervals is a set of real numbers that are either empty or represented as a closed interval.
 For example, the intersection of [1, 3] and [2, 4] is [2, 3].

 Input: firstList = [[0,2],[5,10],[13,23],[24,25]],
 secondList = [[1,5],[8,12],[15,24],[25,26]]

 Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
 */

import com.satyamgupta.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersections {
    public static void main(String[] args) {
        int[][] firstList = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = {{1,5},{8,12},{15,24},{25,26}};

        int[][] ans = solve(firstList, secondList);
        for (int[] val:ans) {
            System.out.println(Arrays.toString(val));
        }
    }

    static int[][] solve(int[][] arr1, int[][] arr2){

        if (arr1.length == 0 || arr2.length == 0) return new int[][]{};

        int i = 0, j = 0;
        List<int[]> list = new ArrayList<>();

        while(i < arr1.length && j < arr2.length){
            int lo = Math.max(arr1[i][0], arr2[j][0]);
            int hi = Math.min(arr1[i][1], arr2[j][1]);

            if (lo <= hi){
                list.add(new int[]{lo, hi});
            }

            if (arr1[i][1] > arr2[j][1]) j += 1;
            else i+= 1;
        }


        return list.toArray(new int[list.size()][]);
    }


}
