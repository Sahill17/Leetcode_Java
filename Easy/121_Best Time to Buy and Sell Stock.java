class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        int maxProfit = 0;

        if(prices.length<2){
            return 0;
        }

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}