class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer>check = new HashMap<>();
        check.put(0,0);
        check.put(1,0);
        check.put(2,0);
        for(int i=0;i<nums.length;i++){
            check.put(nums[i],check.get(nums[i])+1);
        }
        int i=0;
        for(int j=0;j<check.get(0);j++){
            nums[i]=0;
            i++;
        }
        for(int j=0;j<check.get(1);j++){
            nums[i]=1;
            i++;
        }
        for(int j=0;j<check.get(2);j++){
            nums[i]=2;
            i++;
        }
    }
}
