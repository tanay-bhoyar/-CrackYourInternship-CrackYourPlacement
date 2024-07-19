class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            if(st.isEmpty()){
                st.push(i);
            }else if(!st.isEmpty() && temperatures[st.peek()]>=temperatures[i]){
                st.push(i);
            }else if(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                    int x=st.pop();
                    ans[x]=i-x;
                }
                st.push(i);
            }
        }
        return ans;
    }
}
