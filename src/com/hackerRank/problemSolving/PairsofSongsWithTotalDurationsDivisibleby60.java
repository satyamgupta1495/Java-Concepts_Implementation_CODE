package com.hackerRank.problemSolving;

public class PairsofSongsWithTotalDurationsDivisibleby60 {
    public static void main(String[] args) {
        int[] time = {30,20,150,100,40};
        int res = numPairsDivisibleBy60(time);
        System.out.println();
        System.out.println("ans = " + res);
    }
    static int numPairsDivisibleBy60(int[] time) {
        int n = time.length;
        int ans = 0;
        for(int i = 0 ; i < n; ++i){
            for(int j = 1; j < n; ++j){
                if( i< j){
                    System.out.print(i + " ");
                    if(time[i] + time[j] % 60 == 0)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
