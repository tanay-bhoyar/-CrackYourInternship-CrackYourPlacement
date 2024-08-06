class Solution
{
    static String ans;
    //Function to find the largest number after k swaps.
    public static String findMaximumNum(String str, int k)
    {
        //code here.
        char nums[]=str.toCharArray();
        ans=str;
        helper(nums,0,k);
        return ans;
        
    }
    
    public static void helper(char nums[],int i,int k){
        if(k==0||i==nums.length-1){
            String curr=new String(nums);
            if(curr.compareTo(ans)>0){
                ans=curr;
            }
            return;
        }
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]<nums[j]){
                char temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                helper(nums,i+1,k-1);
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        helper(nums,i+1,k);
    }
    
}
