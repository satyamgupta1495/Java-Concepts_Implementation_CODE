package com.hackerRank.problemSolving;


import java.util.*;

public class DailyTemperature {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for(int i = n - 1; i >= 0; i--) {

            // Popping all indices with a lower or equal temperature than the current index
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            System.out.println(st);
            // If the stack still has elements, then the next warmer temperature exists!
            if(!st.isEmpty()) {
                System.out.println(st.peek());
                ans[i] = st.peek() - i;
            }


            // Inserting current index in the stack: monotonicity is maintained!
            st.push(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
