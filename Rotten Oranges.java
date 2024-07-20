
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int t=helper(grid,i,j,0);
                    if(t==Integer.MAX_VALUE){
                        return -1;
                    }
                    ans=Math.max(ans,t);
                }
            }
        }
        return ans;
        // Code here
    }
    
    public int helper(int grid[][],int i,int j,int count){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return Integer.MAX_VALUE;
        }if(grid[i][j]==2){
            return count;
        }
        grid[i][j]=0;
        int min=Integer.MAX_VALUE;
        min=Math.min(min,helper(grid,i+1,j,count+1));
        min=Math.min(min,helper(grid,i-1,j,count+1));
        min=Math.min(min,helper(grid,i,j+1,count+1));
        min=Math.min(min,helper(grid,i,j-1,count+1));
        grid[i][j]=1;
        return min;
    }
    
    
}
