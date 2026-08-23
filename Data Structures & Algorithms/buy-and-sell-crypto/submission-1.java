class Solution {
    public int maxProfit(int[] prices) {
        int b = 0, s = 0, profit = 0;

        while(b < prices.length)
        {
            while(s < prices.length && prices[s] >= prices[b]) 
            {
                profit = Math.max(profit,prices[s] - prices[b]);
                s++; 
            }
            b = s;
        }

        return profit;
    }
}
