package com.hackerRank.problemSolving;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

    }

    public void romanToInt(String s) {

//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

             for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == 'I'){
                    map.put(c, 1);
                }else if(c == 'V'){
                    map.put(c, 5);
                }else if(c == 'X'){
                    map.put(c, 10);
                }else if(c == 'L'){
                    map.put(c, 50);
                }else if(c == 'C'){
                    map.put(c, 100);
                } else if (c == 'D') {
                    map.put(c, 500);
                } else if (c == 'M') {
                    map.put(c, 1000);
                }
            }
        System.out.println(map);



    }
}
