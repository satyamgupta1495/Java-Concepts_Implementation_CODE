package com.hackerRank.problemSolving;

public class StockBuySell {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int sell = 0;
        int index = 0;
        int profit = 0;

        //Buy
        for(int i = 0; i < prices.length; i++){

            if(prices[i] < buy ){
                buy = prices[i];
                index = i;
            }
        }


        //Sell
        for(int i = index; i < prices.length; i++){
            if(sell < prices[i]){
                sell = prices[i];
            }
            profit =  sell - buy;
        }

        System.out.println("Buy -> " + buy);
        System.out.println("Sell -> " + sell);
        System.out.println("Profit -> " + profit);
        return profit;

    }

    int minSoFar(int[] prices){

        // 2 4 1
        int minsoFar = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {

            if(prices[i] < minsoFar){
                minsoFar = prices[i];
            }

            if(maxProfit < prices[i] - minsoFar )
            maxProfit = prices[i] - minsoFar;
        }

        return  maxProfit;
    }

    public static void main(String[] args) {
        int[] array = {2,4,1};
//        int[] array = {7,1,5,3,6,4};
        StockBuySell bs = new StockBuySell();
        System.out.println(bs.minSoFar(array));
    }
}
