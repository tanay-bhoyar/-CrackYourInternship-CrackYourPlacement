class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    helper(grid,i,j);
                }
            }
        }
        return count;
        // Code here
    }
    
    public void helper(char [][]grid,int i,int j){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]=='0'){
            return ;
        }
        grid[i][j]='0';
        helper(grid,i+1,j);
        helper(grid,i-1,j);
        helper(grid,i,j+1);
        helper(grid,i,j-1);
        helper(grid,i+1,j-1);
        helper(grid,i-1,j-1);
        helper(grid,i+1,j+1);
        helper(grid,i-1,j+1);
    }
    
}
