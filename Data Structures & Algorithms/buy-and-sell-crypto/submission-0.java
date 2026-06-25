class Solution {
    public int maxProfit(int[] prices) {
         int max = 0;
        int k = 0;
        for(int j = prices.length-1 ; j>=0 ;j-- ){
            int sell = prices[j];
            for( int i = 0; i< j ; i++ ){
                int max1 = sell - prices[i];
                if(max1 > max){
                    max = max1;
                    k = i;
                }
            }

        }
        
        return max;
        
    }
}
