class Solution {
    public boolean exist(char[][] board, String word) {
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && helper(board,i,j,word,0,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][]board,int i,int j,String word,int x,boolean visited[][]){
        if(x==word.length()){
            return true;
        }
        if(i<0 || i>= board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(x) || visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        if(helper(board,i+1,j,word,x+1,visited)||helper(board,i,j+1,word,x+1,visited)||helper(board,i-1,j,word,x+1,visited)||helper(board,i,j-1,word,x+1,visited)){
            return true;
        }
        visited[i][j]=false;
        return false;
    }

}
