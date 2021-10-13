package com.hackerRank.problemSolving;

import java.util.*;

public class WordSearch {
    public static void main(String[] args) {
//        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char[][] board = {{'A'}};

        isPresent(board,"AB");
    }
    static void isPresent(char[][] board, String word){

        Map<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (char ch:word.toCharArray() ) {
            list2.add(ch);
        }

        for(int i = 0; i < board.length; ++i){
            for(int j = 0; j < board[0].length; ++j){
                if(!map.containsKey(board[i][j])){
                    map.put(board[i][j], 1);
                }else{
                    map.put(board[i][j] ,map.getOrDefault(board[i][j],0)+1);
                }
            }
        }

        for (int i = 0; i < word.length(); i++) {
            int count = map.get(word.charAt(i));
            if (map.containsKey(word.charAt(i))){
                if (count > 0) {
                    map.put(word.charAt(i), count - 1);
                    list.add(word.charAt(i));
                }
            }
        }

        System.out.println(list);
        System.out.println(list2);
        System.out.println(list2.containsAll(list));



    }


}
