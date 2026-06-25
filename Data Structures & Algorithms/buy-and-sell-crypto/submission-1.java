class Solution {
    public int maxProfit(int[] prices) {
        int currP = prices[0];
        int maxP = 0;
        
        for(int i = 1 ; i< prices.length; i++){
           if(currP > prices[i]){
            currP = prices[i];
           }
           else if(prices[i] - currP > maxP){
            maxP = prices[i] - currP;
           
           }
            
        }

        
        return maxP;
        
    }
}
