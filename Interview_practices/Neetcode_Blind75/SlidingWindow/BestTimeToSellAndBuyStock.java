package Interview_practices.Neetcode_Blind75.SlidingWindow;

// https://neetcode.io/problems/buy-and-sell-crypto/question

public class BestTimeToSellAndBuyStock {
    public int maxProfit(int[] prices) {
        int start = prices[0];
        int max = 0;
        
        for(int i = 1; i<prices.length; i++){
            start = Math.min(start,prices[i]);
            max = Math.max(max,prices[i]-start);
        }
        return max;
    }
}
