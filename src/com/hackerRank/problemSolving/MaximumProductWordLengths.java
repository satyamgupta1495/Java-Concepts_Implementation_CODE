package com.hackerRank.problemSolving;

import java.util.*;
public class MaximumProductWordLengths {
    public static void main(String[] args) {
//        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        String[] words = {"a","ab","abc","d","cd","bcd","abcd"};
        int max = 0;
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (!helper(words[i], words[j])){
                    max = Math.max(max, words[i].length()*words[j].length());
                    System.out.println(words[i] + " " + words[j]  + " " + max + " " + helper(words[i],words[j]));
                }
            }
        }

        System.out.println(max);



    }

    static boolean helper(String a, String b){
        List<Character> list = new ArrayList<>();
        boolean flag = false;
        if(a.length() < b.length()) helper(b, a);
        else {
            for (int i = 0; i < a.length(); i++) {
                list.add(a.charAt(i));
            }
            System.out.println(list);
            for (int i = 0; i < b.length(); i++) {
                if (list.contains(b.charAt(i)))  flag = true;

            }

//            System.out.println(flag);

        }

        return flag;
    }
}
