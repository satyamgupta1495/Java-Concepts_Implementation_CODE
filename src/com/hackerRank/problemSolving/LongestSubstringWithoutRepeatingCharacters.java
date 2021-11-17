package com.hackerRank.problemSolving;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(getLength(s));
    }

    static int getLength(String s){
        int l = 0;
        int r = 0;
        Set<Character> set = new HashSet<>();

        int max = 0;
        while(r < s.length()){

            if(set.contains(s.charAt(r))){
                l--;
            }
            max =1+ Math.max(max, l-r+1);
            set.add(s.charAt(r));

            r++;

        }
        return max;
    }

}
