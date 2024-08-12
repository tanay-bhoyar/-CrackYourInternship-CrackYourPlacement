class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        if(k==nums.length){
            return nums;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(st.size()+nums.length-i>k && !st.isEmpty() && st.peek()>nums[i]){
                st.pop();
            }
            if(st.size()<k){
                st.push(nums[i]);
            }
        }
        int ans[]=new int[k];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}
