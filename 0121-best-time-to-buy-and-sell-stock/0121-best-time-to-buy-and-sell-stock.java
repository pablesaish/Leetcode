class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<length; i++) {
            if(prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}