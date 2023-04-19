package com.hackerRank.gfgPTOD;

import java.util.Stack;

public class RemoveTheballs {
    public static void main(String[] args) {

        int N = 3;
        int[] color = {2, 2, 5};
        int[] radius = {3, 3, 4};
        System.out.println(finLength(N, color, radius));

    }

    public static int finLength(int N, int[] color, int[] radius) {
        int n = N;
        Stack<Integer> stack = new Stack<>(); // Use stack to store the indices of non-duplicate balls

        for (int i = 0; i < n; i++) {


            if (stack.isEmpty() || color[i] != color[stack.peek()] || radius[i] != radius[stack.peek()]) {
                System.out.println(stack.isEmpty() + " - " + " - " + color[i] != color[stack.peek()] + " - "  + (radius[i] != radius[stack.peek()]));
                stack.push(i);
            } else {
                stack.pop();
            }
        }
        return stack.size();
    }
}
