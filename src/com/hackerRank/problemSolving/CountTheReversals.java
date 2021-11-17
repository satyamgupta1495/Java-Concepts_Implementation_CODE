package com.hackerRank.problemSolving;

//! https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1?utm_source=gfgpractice&utm_medium=banner&utm_campaign=Practice_Explore_POD_Top_Banner#
/*
    Input:
    S = "}{{}}{{{"
    Output: 3
    Explanation: One way to balance is:
    "{{{}}{}}". There is no balanced sequence
    that can be formed in lesser reversals.
 */

public class CountTheReversals {
    public static void main(String[] args) {
        String s = "}}}{{}}{{{";
        int ans = count(s);
        System.out.println(ans);
    }

    static int count(String s){
        int o = 0;
        int c = 0;

        for (char ch: s.toCharArray()) {
            if(ch == '{'){
                o++;
            }else{
                if (o == 0){
                    o++;
                    c++;
                }else{
                    o--;
                }
            }
        }
        if (o % 2 != 0) return -1;
        return c += o/2;
    }
}
