class Solution {
    public int splitArray(int[] nums, int k) {
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<=end){
            int mid=(start+end)/2;
            int split=helper(nums,mid);
            if(split<=k){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public int helper(int nums[],int mid){
        int split=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                split++;
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return split;
    }
}
