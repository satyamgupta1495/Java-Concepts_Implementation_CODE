package com.hackerRank.problemSolving;


//! https://leetcode.com/problems/surrounded-regions/

import java.util.Arrays;

public class SurroundedRegionsO {
    public static void main(String[] args) {
        String[][] board = {{"X","X","X","X"},
        {"X","O","O","X"},{"X","X","O","X"},{"X","O","X","X"}};

        for (String[] val:board) System.out.println(Arrays.toString(val));
        System.out.println();

        solve(board);

    }

    static void solve(String[][] board) {

        if (board.length == 0) return;

        //! row traversal 1st and last
        for (int i = 0; i < board[0].length; i++) {
            if(board[0][i] == "O"){
                dfs(board, 0, i);
            }
            if(board[board.length-1][i] == "O"){
                dfs(board, board.length-1,i );
            }
        }

        //! Column traversal 1st and last
        for (int j = 0; j < board.length; j++) {
            if (board[j][0] == "O"){
                dfs(board, j, 0);
            }
            if (board[j][board[0].length-1] == "O"){
                dfs(board, j,board[0].length-1);
            }
        }

        //! Traversal

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == "$"){
                    board[i][j] = "O";
                }
                else if (board[i][j] == "O"){
                    board[i][j] = "X";
                }
            }
        }

        for (String[] val:board) System.out.println(Arrays.toString(val));



    }

    static void dfs(String[][] board, int i , int j){

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != "O") return;

        board[i][j] = "$";
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
    }


}
