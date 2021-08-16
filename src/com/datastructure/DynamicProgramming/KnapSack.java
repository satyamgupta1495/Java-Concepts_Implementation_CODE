package com.datastructure.DynamicProgramming;

public class KnapSack {

    int maxProfit(int[] wt, int val[], int W, int n)
    {
        if (n ==0 || W == 0) return 0;

        if (wt[n-1] <= W)
        {
            return Math.max(val[n-1] + maxProfit(wt,val,W-wt[n-1],n-1),maxProfit(wt,val, W, n-1));
        }
        else if (wt[n-1] > W) return maxProfit(wt, val, W, n-1);

        else return 0;
    }

    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        KnapSack sack = new KnapSack();
        int res = sack.maxProfit(wt,val,W,n);
        System.out.println(res);
    }
}
