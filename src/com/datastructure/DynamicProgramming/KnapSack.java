package com.datastructure.DynamicProgramming;

public class KnapSack {

    public int KnapSack(int[] wt , int[] val, int w,int n ){

        if (w == 0 || n == 0) return 0;

        if (w >= wt[n-1]){
            return Math.max(val[n-1] + KnapSack(wt, val, w-wt[n-1],n-1), KnapSack(wt, val, w, n-1));
        }
        else if(wt[n-1] > w){
            KnapSack(wt, val, w, n-1);
        }

        return -1;
    }

    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        KnapSack sack = new KnapSack();
        int res = sack.KnapSack(wt,val,W,n);
        System.out.println(res);
    }
}
