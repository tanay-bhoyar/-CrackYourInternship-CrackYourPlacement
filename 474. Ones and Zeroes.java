class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][][]=new int[strs.length+1][m+1][n+1];
        HashMap<String,int[]> check = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int count1=0;
            int count0=0;
            for(int j=0;j<strs[i].length();j++){
                if(strs[i].charAt(j)=='1'){
                    count1++;
                }else{
                    count0++;
                }
            }
            check.put(strs[i],new int[]{count0,count1});
        }
        int c0=0;
        int c1=0;
        for(int i=1;i<=strs.length;i++){
            int count0=check.get(strs[i-1])[0];
            int count1=check.get(strs[i-1])[1];
            c0+=count0;
            c1+=count1;
            for(int j=0;j<=m;j++){
                for(int k=0;k<=n;k++){
                    if(j==0 && k==0){
                        dp[i][j][k]=0;
                    }else if(c0<=j && c1<=k){
                        dp[i][j][k]=i;
                    }else if(count0<=j && count1<=k){
                        dp[i][j][k]=Math.max(dp[i-1][j][k],dp[i-1][j-count0][k-count1]+1);
                    }else{
                        dp[i][j][k]=dp[i-1][j][k];
                    }
                }
            }
        }
        return dp[strs.length][m][n];
    }
}
