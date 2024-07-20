class Solution {
    public int sumSubarrayMins(int[] arr) {
        int []left=new int[arr.length];
        int []right=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            left[i]=-1;
            right[i]=arr.length;
        }
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                left[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=arr.length-1;i>=0 ;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                right[i]=st.peek();
            }
            st.push(i);
        }
        int mod=(int)1e9+7;
        long ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=(long)(i-left[i])*(right[i]-i)%mod*arr[i]%mod;
            ans%=mod;
        }
        return (int)ans;
    }
}
