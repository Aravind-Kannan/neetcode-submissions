class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, buy = prices[0];

        for(int price: prices)
        {
            if(buy > price) {
                buy = price;
            } 
            profit = Math.max(profit, price - buy);
        }

        return profit;
    }
}
