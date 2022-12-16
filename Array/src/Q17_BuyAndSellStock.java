
//Best Time to Buy and Sell Stock

//Problem LinK:
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Q17_BuyAndSellStock {

    //TC: 0(n)
    //SC:0(1)
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int sell=Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;
    }

}
