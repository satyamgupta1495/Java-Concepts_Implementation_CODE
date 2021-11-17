package com.hackerRank.problemSolving;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int s = 1, h =2, d = 3;
        solve(s, d, h, 3);
    }

    static void solve(int s, int d,int h, int n){
        if (n == 1){
            System.out.println("Move " + s + " " + d);
            return;
        }

        solve(s, h, d, n-1);
        System.out.println("Move " + s + " " + d);
        solve(h, d, s, n-1);

    }
}
