
class Solution
{
    
    public void swap(int[]arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        HashMap<Integer,Integer> check = new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            check.put(nums[i],i);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==check.get(nums[i])){
                continue;
            }else{
                count++;
                swap(nums,i,check.get(nums[i]));
                i--;
            }
        }
        return count;
        // Code here
    }
}
