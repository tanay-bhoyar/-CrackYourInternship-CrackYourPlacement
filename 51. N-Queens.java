class Solution {
    List<int[][]> check = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans = new ArrayList<>();
        int board[][]=new int[n][n];
        helper(board,0);
        for(int i=0;i<check.size();i++){
            ans.add(change(check.get(i)));
        }
        return ans;
    }

    public List<String> change(int board[][]){
        List<String>ans = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String str="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]==1){
                    str+='Q';
                }else{
                    str+='.';
                }
            }
            ans.add(str);
        }
        return ans;
    }

    public boolean isSafe(int board[][],int i,int j){
        for(int x=0;x<i;x++){
            if(board[x][j]==1){
                return false;
            }
        }
        for(int x=i,y=j;x>=0 && y>=0;x--,y--){
            if(board[x][y]==1){
                return false;
            }
        }
        for(int x=i,y=j;x>=0 && y<board.length;x--,y++){
            if(board[x][y]==1){
                return false;
            }
        }
        return true;
    }

    public int[][] copy(int board[][]){
        int ans[][]=new int[board.length][board.length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                ans[i][j]=board[i][j];
            }
        }
        return ans;
    }

    public void helper(int board[][],int i){
        if(i==board.length){
            check.add(copy(board));
            return;
        }
        for(int j=0;j<board.length;j++){
            if(board[i][j]==0 && isSafe(board,i,j)){
                board[i][j]=1;
                helper(board,i+1);
                board[i][j]=0;
            }
        }
    }
}
