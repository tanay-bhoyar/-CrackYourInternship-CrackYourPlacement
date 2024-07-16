class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int curr=i;
            int count=0;
            while(curr>0){
                if(curr%2==1){
                    count++;
                }
                curr=curr/2;
            }
            ans[i]=count;
        }
        return ans;
    }
}
