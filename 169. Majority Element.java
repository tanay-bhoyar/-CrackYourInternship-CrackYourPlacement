class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(check.containsKey(nums[i])){
                check.put(nums[i],check.get(nums[i])+1);
            }else{
                check.put(nums[i],1);
            }
        }
        int ans=0;
        int count=0;
        for(Map.Entry<Integer,Integer> i:check.entrySet()){
            if(i.getValue()>count){
                count=i.getValue();
                ans=i.getKey();
            }
        }
        return ans;
    }
}
