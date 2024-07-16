class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(check.containsKey(nums[i])){
                check.put(nums[i],check.get(nums[i])+1);
            }else{
                check.put(nums[i],1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> i:check.entrySet()){
            if(i.getValue()>1){
                ans.add(i.getKey());
            }
        }
        return ans;
    }
}
