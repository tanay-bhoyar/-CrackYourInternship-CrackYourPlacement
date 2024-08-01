class Solution {
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        Set<Integer>visited=new HashSet<>();
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{1,0});
        while(!q.isEmpty()){
            int[]curr=q.poll();
            int pos=curr[0];
            int moves=curr[1];
            for(int i=1;i<=6;i++){
                int newPos=pos+i;
                if(newPos>n*n){
                    break;
                }
                int[]cord=getPos(newPos,n);
                int r=cord[0];
                int c=cord[1];
                if(board[r][c]!=-1){
                    newPos=board[r][c];
                }
                if(newPos==n*n){
                    return moves+1;
                }
                if(!visited.contains(newPos)){
                    visited.add(newPos);
                    q.offer(new int[]{newPos,moves+1});
                }
            }
        }
        return -1;
    }
    public int[] getPos(int pos,int n){
        int row=(pos-1)/n;
        int col=(pos-1)%n;
        if(row%2==1){
            col=n-1-col;
        }
        row=n-1-row;
        return new int[]{row,col};
    }
}
