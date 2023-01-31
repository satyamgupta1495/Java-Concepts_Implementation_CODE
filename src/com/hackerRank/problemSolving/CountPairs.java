package com.hackerRank.problemSolving;

public class CountPairs {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        int x = 2;
        int[] arr = {3,3,3,2,3,2,2};
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j > 0; j--) {
                if (i < j && arr[i] == arr[j] ){
                    if((i * j) % x == 0)
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
