package com.grind75;

public class BuySellStock1 {
    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices){
        int minSoFar = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(minSoFar > prices[i]){
                minSoFar = prices[i];
            }

            profit = Math.max(profit, prices[i]-minSoFar);
        }

        return profit;
    }



}
