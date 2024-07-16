class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(check.containsKey(target-nums[i])){
                int ans[]=new int[2];
                ans[0]=check.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }else{
                check.put(nums[i],i);
            }
        }
        return new int[2];
    }
}
