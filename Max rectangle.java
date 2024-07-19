/*Complete the function given below*/
class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int dp[]=new int[M[0].length];
        int max=0;
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                if(M[i][j]==1){
                    dp[j]++;
                }else{
                    dp[j]=0;
                }
            }
            max=Math.max(max,helper(dp));
        }
        return max;
    }
    
    public int helper(int[] heights){
        int n=heights.length;
        int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++){
            int curr=0;
            if(i!=n){
                curr=heights[i];
            }

            while(!st.isEmpty() && curr<heights[st.peek()]){
                int top=st.pop();
                int width=0;
                if(st.isEmpty()){
                    width=i;
                }else{
                    width=i-st.peek()-1;
                }
                int area=heights[top]*width;
                max=Math.max(max,area);
            }
            st.push(i);
        }
        return max;
    }
    
}
