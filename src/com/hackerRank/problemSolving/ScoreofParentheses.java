package com.hackerRank.problemSolving;

import java.util.*;

public class ScoreofParentheses {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String s = "()(())";
        int score = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) ==  '(' || s.charAt(i) ==  ')'){
                stack.push(s.charAt(i));
            }else if (stack.peek() == ')'){
                char ch = stack.peek();
                if (Character.isDigit(ch)){
                        score += Character.getNumericValue(ch);
                }else{
                    score += 2 * Character.getNumericValue(ch);
                }
                while(!stack.empty()){
                    stack.pop();
                }
            }
        }
        System.out.println(stack);
        System.out.println(score);
    }
}
