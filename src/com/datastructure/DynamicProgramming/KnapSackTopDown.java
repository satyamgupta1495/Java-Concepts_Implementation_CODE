package com.datastructure.DynamicProgramming;

import static java.lang.Math.max;

public class KnapSackTopDown {

    int knapSack(int[] wt, int[] val, int W, int n) {
        int[][] tn = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0)
                    tn[i][j] = 0;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    tn[i][j] = Math.max(val[i - 1] + tn[i - 1][j - wt[i - 1]], tn[i - 1][j]);
                } else {
                    tn[i][j] = tn[i - 1][j];
                }
            }
        }

        return tn[n][W];
    }

    public static void main(String[] args) {
        int val[] = new int[] { 1,3,5,7 };
        int wt[] = new int[] { 1,2,5,7 };
        int W = 50;
        int n = val.length;
        KnapSackTopDown ks = new KnapSackTopDown();
        int res = ks.knapSack(wt, val, W, n);
        System.out.println(res);
    }
}
