package com.grind75;
//https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "naaaagarm"));
        optimizedIsAnagram("anaaagram", "nannagarm");
    }

    public static boolean optimizedIsAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] hash = new int[26];
        for(char c : s.toCharArray()){
            ++hash[c-'a'];
        }
        System.out.println(Arrays.toString(hash));
        for(int i =0; i < t.length(); ++i){
            char c = t.charAt(i);
            if(--hash[c-'a'] < 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0; i < s.length(); ++i){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            if(map.get(t.charAt(i)) < 0) return false;
        }
        return true;

    }
}
