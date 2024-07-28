class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long>st=new TreeSet<>();
        st.add((long)1);
        int cnt=0;
        long ans=1;
        while(cnt!=n){
            long curr=st.pollFirst();
            ans=curr;
            cnt++;
            st.add(2*curr);
            st.add(3*curr);
            st.add(5*curr);
        }
        return (int)(ans);
    }
}
