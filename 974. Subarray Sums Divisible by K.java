class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> check = new HashMap<>();
        int sum=0;
        int ans=0;
        check.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=(sum+nums[i])%k;
            if(sum<0){
                sum+=k;
            }
            if(check.containsKey(sum)){
                ans+=check.get(sum);
                check.put(sum,check.get(sum)+1);
            }else{
                check.put(sum,1);
            }
        }
        return ans;
    }
}
