// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        if(mat[mat.length-1][mat.length-1]==0){
            return ans;
        }
        boolean [][]visited= new boolean[mat.length][mat[0].length];
        helper(ans,mat,0,0,"",visited);
        return ans;
    }
    
    public void helper(ArrayList<String> ans,int[][]mat,int i,int j,String str,boolean[][]visited){
        if(i==mat.length-1 && j==mat[0].length-1){
            ans.add(str);
            return;
        }
        if(i<0 || i>=mat.length || j<0 || j>=mat[0].length || mat[i][j]==0 || visited[i][j]){
            return;
        }
        visited[i][j]=true;
        helper(ans,mat,i-1,j,str+"U",visited);
        helper(ans,mat,i,j-1,str+"L",visited);
        helper(ans,mat,i+1,j,str+"D",visited);
        helper(ans,mat,i,j+1,str+"R",visited);
        visited[i][j]=false;
    }
    
}
