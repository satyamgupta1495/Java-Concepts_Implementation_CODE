package com.hackerRank.problemSolving;

//Find the counts of elements of an unsorted integer array which are equal to the average of all elements of that array.

/*
    [1, 4, 3, 4]

 */
public class FindAverageElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 1, 4};
        int avg = avg(arr);
        int ans = count(arr, avg);
        System.out.println("There are " + ans + " such elements.");
    }
    private static int count(int[] arr, int avg){
        int count = 0;
        for (int j : arr) {
            if (j == avg) {
                count++;
            }
        }
        return count;
    }
    private static int avg(int[] arr){
        int sum =  0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Avg = " + sum / arr.length);
        return sum / arr.length;
    }
}
