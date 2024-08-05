class Solution {
    public int maximalSquare(char[][] matrix) {
        int dp[][]=new int[matrix.length][matrix[0].length];
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0 || j==0){
                    dp[i][j]=matrix[i][j]-'0';
                    ans=Math.max(ans,dp[i][j]);
                }else if(matrix[i][j]=='1'){
                    dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                    ans=Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return ans*ans;
    }
}
