class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(check.containsKey(nums[i])){
                check.put(nums[i],check.get(nums[i])+1);
            }else{
                check.put(nums[i],1);
            }
        }
        int arr[]=new int[check.size()];
        int count=0;
        for(Map.Entry<Integer,Integer>i:check.entrySet()){
            arr[count]=i.getKey();
            count++;
        }
        Arrays.sort(arr);
        int dp[]=new int[arr.length];
        dp[0]=arr[0]*check.get(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==1){
                if(i-2>=0){
                    dp[i]=Math.max(dp[i-2]+(arr[i]*check.get(arr[i])),dp[i-1]);
                    
                }else{
                    dp[i]=Math.max(arr[i]*check.get(arr[i]),dp[i-1]);
                }
            }else{
                dp[i]=dp[i-1]+(arr[i]*check.get(arr[i]));
            }
        }
        

        return dp[dp.length-1];
    }
}
