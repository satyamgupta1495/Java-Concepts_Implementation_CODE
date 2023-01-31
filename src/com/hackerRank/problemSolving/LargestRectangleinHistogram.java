package com.hackerRank.problemSolving;
import java.util.*;

public class LargestRectangleinHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        solve(heights);
    }

    static int solve(int[] heights){
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stk.isEmpty()){
                left[i] = 0;
                stk.push(i);
            }else{
                while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
                    stk.pop();
                left[i] = stk.isEmpty() ? 0 : stk.peek()+1;

                stk.push(i);
            }
        }
        stk.clear();
        for (int i = n-1; i >= 0; --i) {
            if (stk.isEmpty()){
                right[i] = n-1;
                stk.push(n-1);
            }else{
                while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
                    stk.pop();
                right[i] = stk.isEmpty() ? n-1 : stk.peek()-1;
                stk.push(i);
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, heights[i]*(right[i]-left[i] + 1));
        }
        System.out.println(max);
        return max;
    }
}