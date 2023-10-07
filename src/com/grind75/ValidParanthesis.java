package com.grind75;

import java.util.Stack;

//! https://leetcode.com/problems/valid-parentheses/

public class ValidParanthesis {
    public static void main(String[] args) {

//        Input: s = "()[]{}"
//        Output: true
        String s = "()[]{}";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stk.push(s.charAt(i));
            }else if(s.charAt(i) == ')' && stk.pop() != '(') return false;
            else if (s.charAt(i) == ']' && stk.pop() != '[') return false;
            else if(s.charAt(i) == '}' && stk.pop() != '{') return false;
        }
        return stk.empty();
    }
}
