class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> check = new HashMap<>();
        int sum=0;
        int ans=0;
        check.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(check.containsKey(sum-k)){
                ans+=check.get(sum-k);
            }if(check.containsKey(sum)){
                check.put(sum,check.get(sum)+1);
            }else{
                check.put(sum,1);
            }
        }
        return ans;
    }
}
