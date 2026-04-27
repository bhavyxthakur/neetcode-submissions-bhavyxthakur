class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int s = 0;
        for(int a = 0; a < prices.length && j < prices.length; a++){
            if(prices[i] > prices[j]){
                i = j;
            }else{
                s = Math.max(s, prices[j] - prices[i]);
            }
            j++;
        }
        return s;
    }
}
