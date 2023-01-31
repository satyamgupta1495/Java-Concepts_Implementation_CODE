package com.hackerRank.problemSolving;

//! https://leetcode.com/problems/validate-stack-sequences/

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5},  popped = {4,5,3,2,1};

        Stack<Integer> stack = new Stack<>();
        for(int i = 0, j = 0 ; i < pushed.length; ++i){
            stack.push(pushed[i]);
            while(!stack.empty() && stack.peek() == popped[j]){
                stack.pop();
                j++;
            }
            System.out.println(stack.isEmpty());
        }

    }
}
