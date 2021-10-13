package com.hackerRank.problemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nuts_And_Bolts {
    public static void main(String[] args) {
        char[] nuts= {'^', '&', '%', '@', '#', '*', '$', '~', '!'};
        char[] bolts = {'~', '#', '@', '%', '&', '*', '$' ,'^', '!'};
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for(char ch : nuts){
            list1.add(ch);
        }
        for(char ch : bolts){
            list2.add(ch);
        }

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println();
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
