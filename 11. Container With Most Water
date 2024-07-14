class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int prod=Math.min(height[i],height[j])*(j-i);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
            ans=Math.max(ans,prod);
        }
        return ans;
    }
}
