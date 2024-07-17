class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean visited[][]=new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,image[sr][sc],sr,sc,visited);
        return image;
    }

    public void helper(int image[][],int sr,int sc,int color,int curr,int i,int j,boolean[][]visited){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || visited[i][j]==true || image[i][j]!=curr){
            return;
        }
        visited[i][j]=true;
        image[i][j]=color;
        helper(image,sr,sc,color,curr,i+1,j,visited);
        helper(image,sr,sc,color,curr,i-1,j,visited);
        helper(image,sr,sc,color,curr,i,j+1,visited);
        helper(image,sr,sc,color,curr,i,j-1,visited);
    }

}
