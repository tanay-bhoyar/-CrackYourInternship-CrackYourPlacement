class Solution {
    public int coinChange(int[] coins, int amount) {
        long dp[]=new long[amount+1];
        Arrays.sort(coins);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=0;j<coins.length && i>=coins[j];j++){
                dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
            }
        }
        if(dp[amount]>=Integer.MAX_VALUE){
            return -1;
        }
        return (int)dp[amount];
    }
}
