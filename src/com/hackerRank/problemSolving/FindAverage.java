package com.hackerRank.problemSolving;

import java.util.Arrays;

/*
Find the average of largest and smallest numbers in an unsorted integer array?

Eg.
[1, 4, 3, 2]
    = (1+4)/2
    = 2.5
[1, 4, 3, 4]
    =(1+4+4)/3
    = 3
 */
public class FindAverage {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        float ans = count(arr);
        System.out.println("Average = " + ans);
    }

    private static float count(int[] arr){
        int minElem = Integer.MAX_VALUE;
        int maxElem = Integer.MIN_VALUE;

        //We can also sort the array  TC ->  O(n log(n)) but by using this the TC remain O👎
        for (int j : arr) {
            if (j < minElem) {
                minElem = j;
            }
            if (j > maxElem) {
                maxElem = j;
            }
        }

        int minCount = 0;
        int maxCount = 0;

        for (int j : arr) {
            if (arr[0] == j) {
                minCount++;
            }
        }

        for (int i = arr.length-1; i > 0; i--) {
            if (arr[arr.length-1] == arr[i]) {
                maxCount++;
            }
        }
        return findAvg(minElem, maxElem,minCount, maxCount);
    }

    private static float findAvg(int minElem, int maxElem, int minCount, int maxCount){
        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < minCount; i++) {
            minSum += minElem;
        }

        for (int i = 0; i < maxCount; i++) {
            maxSum += maxElem;
        }
        return (float)(minSum + maxSum) / (minCount + maxCount);
    }
}



