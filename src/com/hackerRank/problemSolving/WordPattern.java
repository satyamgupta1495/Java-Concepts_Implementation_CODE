package com.hackerRank.problemSolving;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {

        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
//        wordPattern(pattern, s);
    }

    static boolean wordPattern(String pattern, String s) {

        //pattern = "abba", s = "dog cat cat dog"

        int len = 0;
        int n = pattern.length();
        String[] arr = new String[n];
        for (String w: s.split(" ")) {
            arr[len] = w;
            len++;
        }
        for (String w: arr) {
            System.out.print(w + " ");
        }
        if (len != n) return false;
        HashMap<Character, String> map = new HashMap<>();


        for (int i = 0; i < n; ++i){
            map.put(pattern.charAt(i), arr[i]);
        }

        System.out.println(map);

return true;

    }
}
