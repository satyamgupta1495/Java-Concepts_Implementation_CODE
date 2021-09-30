package com.datastructure.DynamicProgramming;

import java.util.Arrays;

public class UB1_RodCuttingProblem {
    public static void main(String[] args) {

        int ans = maximizeCuts(10,5,3,1);
        System.out.println(ans);
        int[][] arr = {{1,2,3},{3,4,5}};

    }

    static int maximizeCuts(int len, int x, int y, int z){

        int[] cut = {x,y,z};
        int cn = cut.length;

        int[] price = new int[len+1];
        Arrays.fill(price,0);
        price[x] = 1;
        price[y] = 1;
        price[z] = 1;



        int[][] t = new int[cn+1][len+1];

        for(int  i = 0; i <= cn; ++i){
            for(int  j = 0; j <= len; ++j){
                if(i == 0) t[i][j] = 0;
                if(j == 0) t[i][j] = 0;
            }
        }

        for(int  i = 1; i <= cn; ++i){
            for(int  j = 1; j <= len; ++j){
                if(cut[i-1] <= j){
                    t[i][j] = Math.max(price[i-1] + t[i][j-cut[i-1]], t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[cn][len];
    }

}
