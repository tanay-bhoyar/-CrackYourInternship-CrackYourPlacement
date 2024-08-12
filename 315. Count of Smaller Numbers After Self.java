class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer>result=new ArrayList<>();
        List<Integer>sorted=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int idx=helper(sorted,nums[i]);
            result.add(idx);
            sorted.add(idx,nums[i]);
        }
        Collections.reverse(result);
        return result;
    }
    public int helper(List<Integer> check,int curr){
        int l=0;
        int r=check.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(check.get(mid)<curr){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l;
    }
}
