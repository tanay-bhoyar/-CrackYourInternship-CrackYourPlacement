class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int med=0;
        if(nums.length%2==1){
            med=nums[nums.length/2];
        }
        else{
            med=(nums[nums.length/2]+nums[(nums.length/2)-1])/2;
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=Math.abs(nums[i]-med);
        }
        return ans;
    }
}
