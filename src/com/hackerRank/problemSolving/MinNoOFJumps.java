package com.hackerRank.problemSolving;

public class MinNoOFJumps {


    //! do it again
    //? DONE
    // O(N)
    static int minJumps(int[] arr){

        if (arr.length <= 1) return 0;
        if (arr[0] == 0) return -1;

        int n = arr.length;

        int step = arr[0];
        int jump = 1;
        int maxReach = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (i == n-1) return jump;
            maxReach = Math.max(maxReach, arr[i]+i);
            step--;
            if (step == 0) {
                if (i >= maxReach) return -1;
                step = maxReach-i;
                jump++;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int ans = minJumps(arr);
        System.out.println(ans);
    }
}
