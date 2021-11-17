package com.hackerRank.problemSolving;

public class ArrangingCoins_StairCase {
    public static void main(String[] args) {

        int ans = arrangeCoins(8);
        System.out.println(ans);
    }
    static int arrangeCoins(int n) {
        if(n == 0) return 0;
        int stair = 0;
        int temp = n;
        for(int i = 1; i <= n; ++i){

            temp = temp-i;
            if(temp > i) stair++;
            else break;

        }
        return stair+1;
    }
}
