class Solution {
    public int mctFromLeafValues(int[] arr) {
        if(arr.length<2){
            return 0;
        }
        Stack<Integer> st = new Stack<>();
        int ans=0;
        st.push(Integer.MAX_VALUE);
        for(int i=0;i<arr.length;i++){
            while(st.peek()<=arr[i]){
                int x=st.pop();
                ans=ans+x*Math.min(st.peek(),arr[i]);
            }
            st.push(arr[i]);
        }
        while(st.size()>2){
            ans=ans+(st.pop()*st.peek());
        }
        return ans;
    }
}
