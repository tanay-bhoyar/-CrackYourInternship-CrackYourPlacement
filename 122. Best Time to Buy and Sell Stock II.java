class Solution {
    public int maxProfit(int[] prices) {
        int diffs[]=new int[prices.length-1];
        for(int i=0;i<prices.length-1;i++){
            diffs[i]=prices[i+1]-prices[i];
        }
        int ans=0;
        for(int i=0;i<diffs.length;i++){
            if(diffs[i]>0){
                ans+=diffs[i];
            }
        }
        return ans;
    }
}
