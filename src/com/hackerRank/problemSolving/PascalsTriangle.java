package com.hackerRank.problemSolving;
import java.util.ArrayList;
import java.util.List;

//! find elements at r = 5 and c = 3 in pascal's triangle

/*
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 $ 4 1

    where $ = 6;
    why ? -> r-1^C / c-1;

 */


public class PascalsTriangle {
    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row, pre = null;

        for(int i = 0; i < numRows; ++i){
            row = new ArrayList<>();
            for(int j = 0; j <= i; ++j){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(pre.get(j-1) + pre.get(j));
                }

            }
            pre = row;
            res.add(row);

        }
        return res;
    }

}
