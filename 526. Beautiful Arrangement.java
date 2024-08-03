class Solution {
    int count=0;

    public int countArrangement(int n) {
        boolean visited[]=new boolean[n+1];
        helper(n,1,visited);
        return count;
    }

    public void helper(int n,int i,boolean visited[]){
        if(i>n){
            count++;
            return;
        }
        for(int j=1;j<=n;j++){
            if(!visited[j]&& (i%j==0 || j%i==0)){
                visited[j]=true;
                helper(n,i+1,visited);
                visited[j]=false;
            }
        }
    }

}
