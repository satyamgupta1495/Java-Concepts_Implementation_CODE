package com.hackerRank.problemSolving;

import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
//        int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};

        char[][] matrix = { {'1','0','1','0','0'},
                            {'1','0','1','1','1'},
                            {'1','1','1','1','1'},
                            {'1','0','0','1','0'}};


        int n = matrix[0].length;

        int[] arr = new int[n];

        for (int i = 0; i < matrix[0].length; i++) {
            int curr = 0;
            for (int j = 0; j < matrix.length; j++) {
                int temp = Character.getNumericValue(matrix[j][i]);
                if ( temp == 1){
                    curr++;
                    arr[i] = curr;
                }
            }
        }
        int ans = solve(arr);
        System.out.println(ans);

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



