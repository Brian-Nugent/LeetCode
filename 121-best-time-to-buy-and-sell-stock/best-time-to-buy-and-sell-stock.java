class Solution {
    public int maxProfit(int[] prices) {
        
        int low = 0, best = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i]-prices[low] > best)
                best = prices[i]-prices[low];
            
            if(prices[i] <= prices[low])
                low = i;
        }
        return best;
    }
}