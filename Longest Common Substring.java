// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int dp[][]=new int[s1.length()][s2.length()];
        int ans=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    ans=Math.max(ans,dp[i][j]);
                }
            }
        }
        return ans;
    }
}
