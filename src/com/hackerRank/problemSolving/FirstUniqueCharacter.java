package com.hackerRank.problemSolving;

import java.util.*;
import java.util.stream.Stream;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
//        String s = "leetcode";
//        String s = "aabb";
        System.out.println(uniqueAproach(s));
    }

    static int uniqueAproach(String s){
        for (char ch: s.toCharArray()) {
            int firstIndex = s.indexOf(ch);
            int lastIndex = s.lastIndexOf(ch);
            if (firstIndex == lastIndex) return firstIndex;
        }
        return -1;
    }

    static int uniqueChar(String s){

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int count = map.getOrDefault(s.charAt(i), 0);
            if (map.containsKey(s.charAt(i)) && count == 1){
                return i;
            }
        }
//        System.out.println(map);
//        System.out.println(s.charAt(3));

        

        return -1;

    }
}
