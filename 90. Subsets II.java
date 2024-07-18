class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> check = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        helper(check,x,nums,0);
        for(List<Integer> i:check){
            ans.add(i);
        }
        return ans;
    }

    public void helper(Set<List<Integer>> check , List<Integer> x , int nums[], int i){
        if(i==nums.length){
            check.add(new ArrayList<>(x));
            return;
        }
        helper(check,x,nums,i+1);
        x.add(nums[i]);
        helper(check,x,nums,i+1);
        x.remove(x.size()-1);
    }

}
