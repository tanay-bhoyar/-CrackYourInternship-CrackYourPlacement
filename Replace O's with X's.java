//User function Template for Java

class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]=='O'){
                    a[i][j]='1';
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i][0]=='1'){
                helper(a,i,0);
            }
        }
        for(int i=0;i<a[0].length;i++){
            if(a[0][i]=='1'){
                helper(a,0,i);
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i][a[0].length-1]=='1'){
                helper(a,i,a[0].length-1);
            }
        }
        for(int i=0;i<a[0].length;i++){
            if(a[a.length-1][i]=='1'){
                helper(a,a.length-1,i);
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]=='1'){
                    a[i][j]='X';
                }
            }
        }
        return a;
        // code here
    }
    
    static void helper(char [][]grid,int i,int j){
        if(i<0|| i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='X' || grid[i][j]=='O'){
            return;
        }
        grid[i][j]='O';
        helper(grid,i+1,j);
        helper(grid,i-1,j);
        helper(grid,i,j+1);
        helper(grid,i,j-1);
    }
}
