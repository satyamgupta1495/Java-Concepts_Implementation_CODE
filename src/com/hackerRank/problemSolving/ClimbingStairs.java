package com.hackerRank.problemSolving;

public class ClimbingStairs {
    static int[] dp = new int[45];
    public static void main(String[] args) {

    }

    //! Fibb Approach
    static int count(int n){
        int prev = 0;
        int curr = 1, next = 1;

        while(n-- > 0){
            prev = curr;
            curr = next;
            next = curr + prev;
        }
        return curr;
    }

    //? DP approach
    static int countDp(int n) {
        if (n == 0 || n == 1 ) return 1;
        if (dp[n] != -1) return dp[n];

        return dp[n] = countDp(n-1) + countDp(n-2);

    }

}
