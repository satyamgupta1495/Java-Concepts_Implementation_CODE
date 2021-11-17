package com.hackerRank.problemSolving;

import java.util.Arrays;

public class ReverseStringWithSpaces {
    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        StringBuilder res = new StringBuilder();
        StringBuilder sb;

        String[] word = s.split(" ");
        for (String val:word) {
            System.out.println(val);
            sb = new StringBuilder(val);

            res.append(sb.reverse());
            res.append(" ");
        }

        System.out.println();
        System.out.println(res.toString().trim());
    }


}
