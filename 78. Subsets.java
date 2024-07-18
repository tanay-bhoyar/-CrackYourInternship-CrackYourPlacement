class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> check = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        helper(check,x,0,nums);
        return check;
    }
    public void helper(List<List<Integer>> check,List<Integer> x,int i,int nums[]){
        if(i==nums.length){
            check.add(new ArrayList<>(x));
            return;
        }
        helper(check,x,i+1,nums);
        x.add(nums[i]);
        helper(check,x,i+1,nums);
        x.remove(x.size()-1);
    }
}
