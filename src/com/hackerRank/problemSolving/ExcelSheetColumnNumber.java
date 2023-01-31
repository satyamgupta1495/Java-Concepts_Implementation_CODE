package com.hackerRank.problemSolving;

//! https://leetcode.com/problems/excel-sheet-column-number/

import java.util.HashMap;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        for(int i= 1000; i < 6666; ++i){
            System.out.println(i);
        }
    }

    static int titleToNumber(String columnTitle) {

        int col = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        char ch = 'a';
        for (int i = 1; i <= 26 ; i++, ch++) {
            map.put(ch,i);

        }

        for (int i = columnTitle.length()-1; i > 0 ; i--) {

        }

        System.out.println(map);

        return col;

    }

}
