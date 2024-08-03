class Solution {
    public int MinCoin(int[] nums, int amount) {
        // Code here
        long dp[]=new long[amount+1];
        Arrays.sort(nums);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=0;j<nums.length && nums[j]<=i;j++){
                dp[i]=Math.min(dp[i],1L+dp[i-nums[j]]);
            }
        }
        if(dp[amount]>=Integer.MAX_VALUE){
            return -1;
        }
        return (int)(dp[amount]);
    }
}
