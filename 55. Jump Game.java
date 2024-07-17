class Solution {
    public boolean canJump(int[] nums) {
        if(nums[0]==0 && nums.length>1){
            return false;
        }
        if(nums[0]==0 && nums.length==1){
            return true;
        }
        int max=nums[0];
        for(int i=0;i<=max;i++){
            max=Math.max(nums[i]+i,max);
            if(max>=nums.length-1){
                return true;
            }
            System.out.println(max);
        }
        return false;
    }
}
