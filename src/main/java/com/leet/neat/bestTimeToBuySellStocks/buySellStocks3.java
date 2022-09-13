package com.leet.neat.bestTimeToBuySellStocks;

public class buySellStocks3 {

    public int maxProfit(int[] prices) {

        int minimumBuyPrice=prices[0];
        int maximumSellPrice=prices[prices.length-1];
        int profit=0;
        int pminBuy[]=new int[prices.length];
        int pmaxSell[]=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            minimumBuyPrice=Math.min(minimumBuyPrice,prices[i]);
            profit=Math.max(prices[i]-minimumBuyPrice,profit);
            pmaxSell[i]=profit;
        }
        profit=0;
        for(int i=prices.length-1;i>=0;i--){
            maximumSellPrice=Math.max(maximumSellPrice,prices[i]);
            profit=Math.max(maximumSellPrice-prices[i],profit);
            pminBuy[i]=profit;
        }

        profit=0;
        for(int i=0;i<prices.length;i++){
            profit=Math.max(profit,pminBuy[i]+pmaxSell[i]);
        }

        return profit;
    }

    public static void main(String[] args) {
        int [] prices= {3,3,5,0,0,3,1,4};
        buySellStocks3 buySellStocks3=new buySellStocks3();
        buySellStocks3.maxProfit(prices);
    }
}
