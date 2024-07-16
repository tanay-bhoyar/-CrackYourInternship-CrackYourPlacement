class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int y=0;
        int x=0;
        while(y<nums.length){
            if(nums[y]==0){
                count++;
                y++;
                continue;
            }
            if(nums[y]!=0){
                nums[x]=nums[y];
                x++;
                y++;
            }
        }
        System.out.println(x);
        while(x<nums.length){
            nums[x]=0;
            x++;
        }
        
    }
}
