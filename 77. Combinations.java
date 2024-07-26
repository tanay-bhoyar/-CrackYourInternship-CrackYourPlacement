class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=i+1;
        }
        helper(ans,new ArrayList<>(),nums,0,k);
        return ans;
    }

    public void helper(List<List<Integer>> check,List<Integer> x,int nums[],int i,int k){
        if(x.size()==k){
            check.add(new ArrayList<>(x));
        }else{
            for(int j=i;j<nums.length;j++){
                x.add(nums[j]);
                helper(check,x,nums,j+1,k);
                x.remove(x.size()-1);
            }
        }
    }
}
