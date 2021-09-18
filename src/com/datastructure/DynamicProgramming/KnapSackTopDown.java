package com.datastructure.DynamicProgramming;

import static java.lang.Math.max;

public class KnapSackTopDown {

    int knapSack(int[] wt, int[] val, int W, int n)
    {
        int[][] tn = new int[n+1][W+1];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < W; j++) {
                if (i==0 || j==0)
                    tn[i][j] = 0;
            }
        }

        if (wt[n-1] <=  W){
            return tn[n][W]  = max((val[n-1] + tn[n-1][W - wt[n-1]]),tn[n-1][W]);
        }
        else
            return tn[n][W] = tn[n-1][W];

    }

    public static void main(String[] args) {

        int val[] = new int[] { 60, 100, 120,60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30,60, 100, 120 };
        int W = 7;
        int n = val.length;
        KnapSackTopDown ks = new KnapSackTopDown();
        int res = ks.knapSack(wt, val,W,n);
        System.out.println(res);

    }
}
