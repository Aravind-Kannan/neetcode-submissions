class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 0, n = prices.length, maxProfit = 0;

        while(r < n)
        {
            maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            if(prices[r] >= prices[l]) r++;
            else l = r;
        }

        return maxProfit;
    }
}
