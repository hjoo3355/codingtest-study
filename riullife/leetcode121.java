class Solution {
    public int maxProfit(int[] prices) {
    
    int maxProfit=0, dailyGap=0;
    int min = 10001;
    
    if(prices.length == 1){
        return 0;
    }
        
     for(int i=0; i<prices.length; i++){
        if(min > prices[i]){
            min = prices[i];
        }
        else{
            dailyGap = prices[i]-min;
            if(maxProfit < dailyGap){
                maxProfit = dailyGap;
            }
        }
     }
        
        return maxProfit;
        
    }
}
