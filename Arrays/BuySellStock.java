public class BuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int i =0; i<prices.length ;i++){
            minPrice = Math.min(prices[i], minPrice);
            maxPrice = Math.max(maxPrice, prices[i]-minPrice);
        }

        return maxPrice;        
    }

    
}