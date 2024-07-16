class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>0){
            return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }
        if(nums[nums.length-1]<0){
            return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }
        int prod1=nums[0]*nums[1]*nums[nums.length-1];
        int prod2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Math.max(prod1,prod2);
    }
}
