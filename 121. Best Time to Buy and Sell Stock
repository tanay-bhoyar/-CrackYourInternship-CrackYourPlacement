class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int diff=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int d=prices[i]-min;
            diff=Math.max(d,diff);
        }
        return diff;
    }
}
