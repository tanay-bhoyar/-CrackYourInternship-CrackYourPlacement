class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> check = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(check,new ArrayList<>(),candidates,target,0);
        for(List<Integer>i:check){
            ans.add(i);
        }
        return ans;
    }

    public void helper(Set<List<Integer>>check,List<Integer>x,int nums[],int target,int i){
        if(target<0){
            return;
        }
        else if(target==0){
            check.add(new ArrayList<>(x));
            return;
        }else{
            for(int j=i;j<nums.length;j++){
                if(j>i && nums[j-1]==nums[j]){
                    continue;
                }
                x.add(nums[j]);
                helper(check,x,nums,target-nums[j],j+1);
                x.remove(x.size()-1);
            }
        }
    }

}
