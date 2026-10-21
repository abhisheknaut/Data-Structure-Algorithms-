class Solution {
    public int maxProfit(int[] prices) {
        int buy  = Integer.MAX_VALUE;
        int ans = 0;
        for(int i =0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit = prices[i] - buy;
                ans +=profit;
            }
            buy = prices[i];

        }
        return ans;
    }
}