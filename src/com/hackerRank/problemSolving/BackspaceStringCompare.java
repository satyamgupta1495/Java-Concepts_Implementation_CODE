package com.hackerRank.problemSolving;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "a##c", t = "#a#c";



        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        if (s.length() == t.length()){
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '#') st1.push(s.charAt(i));
                else st1.pop();

                if (t.charAt(i) != '#') st2.push(t.charAt(i));
                else st2.pop();
            }

            System.out.println(st1.equals(st2));
        }else
        {
            System.out.println(false);
        }

    }
}
