class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> check = new HashSet<>();
        if(nums[0]>=0 && target<0){
            return ans;
        }
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        List<Integer> x= new ArrayList<>();
                        x.add(nums[i]);
                        x.add(nums[j]);
                        x.add(nums[k]);
                        x.add(nums[l]);
                        check.add(x);
                        k++;
                        l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        for(List<Integer> i:check){
            ans.add(i);
        }
        return ans;
    }
}
