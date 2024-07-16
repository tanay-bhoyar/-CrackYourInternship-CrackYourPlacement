class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> check = new TreeSet<>();
        
        for(int i=0;i<nums.length;i++){
            check.add(nums[i]);
        }
        int x=0;
        for(int i:check){
            nums[x]=i;
            x++;
        }
        return check.size();
    }
}
