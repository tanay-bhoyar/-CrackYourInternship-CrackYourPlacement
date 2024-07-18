class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> check = new HashSet<>();
        List<Integer> x= new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean visited[]=new boolean [nums.length];
        helper(check,x,visited,nums);
        for(List<Integer> i:check){
            ans.add(i);
        }
        return ans;
    }

    public void helper(Set<List<Integer>> check,List<Integer> x,boolean[] visited,int[] nums){
        if(x.size()==nums.length){
            check.add(new ArrayList<>(x));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                x.add(nums[i]);
                helper(check,x,visited,nums);
                visited[i]=false;
                x.remove(x.size()-1);
            }
        }
    }   

}
