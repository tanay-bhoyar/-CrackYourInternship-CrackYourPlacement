class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans=0;
        for(int i=0;i<=heights.length;i++){
            int curr=0;
            if(i!=heights.length){
                curr=heights[i];
            }
            while(!st.isEmpty() && heights[st.peek()]>curr){
                int top=st.pop();
                int width=0;
                if(st.isEmpty()){
                    width=i;
                }else{
                    width=i-st.peek()-1;
                }
                int area=heights[top]*width;
                ans=Math.max(ans,area);
            }
            st.push(i);
        }
        return ans;
    }
}
