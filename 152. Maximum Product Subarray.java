class Solution {
    public int maxProduct(int[] nums) {
        double prod1=1;
        double prod2=1;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            prod1=prod1*nums[i];
            max1=Math.max((int)(prod1),max1);
            if(prod1==0){
                prod1=1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            prod2=prod2*nums[i];
            max2=Math.max((max2),(int)prod2);
            if(prod2==0){
                prod2=1;
            }
        }
        System.out.println(max1+" "+max2);
        int max=Math.max(max1,max2);
        return max;
    }
}
