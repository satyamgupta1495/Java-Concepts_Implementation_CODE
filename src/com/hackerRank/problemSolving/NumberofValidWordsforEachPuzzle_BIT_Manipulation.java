package com.hackerRank.problemSolving;

import java.util.*;

public class NumberofValidWordsforEachPuzzle_BIT_Manipulation {
    public static void main(String[] args) {

        String[] words = {"aaaa","asas","able","ability","actt","actor","access"};
        String[] puzzles = {"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
        List<Integer> list = findNumOfValidWords(words, puzzles);
        System.out.println(list);
    }
     static List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {

        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();

        // Initializing the Hashmap with empty arraylist
        for(int i = 0; i < 26; ++i){
            map.put((char) ('a'+i), new ArrayList<>());
        }


        for(String val : words){
            int mask = getMask(val);

            HashSet<Character> unique = new HashSet<>();

            for(char ch : val.toCharArray()){

                if(unique.contains(ch)){
                    continue;
                }
                unique.add(ch);
                map.get(ch).add(mask);
            }
        }

        List<Integer> res = new ArrayList<>();

        for(String word : puzzles){
            int pmask = getMask(word);

            // select 1st char of words in puzzles, and search for only those word in arrayList of map
            char f_char = word.charAt(0);

            ArrayList<Integer> check = map.get(f_char);

            int count = 0;
            for(int wmask : check){
                if((wmask & pmask) == wmask){
                    count++;
                }
            }
            res.add(count);
        }

         System.out.println(map);
         System.out.println();
        return res;
    }
    static int getMask(String val){
        int mask = 0;
        for(char ch : val.toCharArray()){
            int bit = ch - 'a';
            mask = mask | ((1 << bit));
        }
        return mask;
    }

}
