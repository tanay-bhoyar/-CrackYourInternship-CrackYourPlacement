class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(check.contains(nums[i])){
                return nums[i];
            }else{
                check.add(nums[i]);
            }
        }
        return -1;
    }
}
