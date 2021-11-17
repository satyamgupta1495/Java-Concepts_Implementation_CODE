package com.datastructure.Recursion;

import java.util.*;

public class R7_PrintAllSubset {
    public static void main(String[] args) {

        TreeSet<String> res = new TreeSet<>();
        String s = "abc";
        solve(s,"",res, 2);
//        Collections.sort(res);
        System.out.println(res);
    }

    static void solve(String input, String output, TreeSet<String> res , int k){
        if(input.length()==0){
            if(output.length() == k)
            res.add(output);
            return;
        }
        String out1 = output;
        String out2 = output;
        out2 += input.charAt(0);
        input = input.substring(1);

        solve(input,out1, res, k);
        solve(input,out2, res, k);
    }
}
