package com.hackerRank.problemSolving;

import com.satyamgupta.Array;

import java.util.Arrays;

//! https://leetcode.com/problems/unique-paths-iii/
public class UniquePath3 {
    public static void main(String[] args) {
         int[][] grid = {{2,0,0,0},{0,1,0,0},{0,0,0,-1}};
        for (int[] val: grid  ) {
            System.out.println(Arrays.toString(val));
        }
//        uniquePathsIII(grid);
        System.out.println(uniquePathsIII(grid));
    }
    static int uniquePathsIII(int[][] grid) {

        int sx = 0, sy = 0, zeros = 0;
        for(int i = 0 ; i < grid.length; ++i){
            for(int j = 0 ; j < grid[0].length; ++j){
                if(grid[i][j] == 0){
                    zeros++;
                }else if(grid[i][j] == 1){
                    sx = i;
                    sy = j;
                }
            }
        }
//        System.out.println(zeros);
        return dfs(grid, sx, sy, zeros);
    }

    static int dfs(int[][] grid, int r, int c, int zeros){

        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == -1) return 0;

        if(grid[r][c] == 2) {
            if(zeros == -1){
//                System.out.println("condtion satisfied");
                return 1;
            }else{
//                System.out.println("condtion NOOOT satisfied");
                return 0;
            }
        }
        grid[r][c] = -1;
        zeros--;

        int totalPathSum =
                dfs(grid, r-1, c, zeros) +
                dfs(grid, r+1, c, zeros) +
                dfs(grid, r, c+1, zeros) +
                dfs(grid, r, c-1, zeros) ;

        grid[r][c] = 0;
        zeros++;

        return totalPathSum;

    }
}
