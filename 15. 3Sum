class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> s=new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            int sum=0;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else{
                    List<Integer> check = new ArrayList<>();
                    check.add(nums[i]);
                    check.add(nums[j]);
                    check.add(nums[k]);
                    s.add(check);
                    k--;
                    j++;
                }
            }
        }
        for(List<Integer>i:s){
            ans.add(i);
        }
        return ans;
    }
}
