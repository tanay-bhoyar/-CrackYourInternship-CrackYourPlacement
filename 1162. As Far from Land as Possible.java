class Solution {

    class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public int maxDistance(int[][] grid) {
        Queue<Pair>q=new LinkedList<>();
        boolean visited[][]=new boolean[grid.length][grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==1){
                    q.offer(new Pair(i,j));
                }
            }
        }
        if(q.size()==0 || q.size()==grid.length*grid.length){
            return -1;
        }
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair curr=q.poll();
                visited[curr.x][curr.y]=true;
                if(curr.x+1<grid.length && grid[curr.x+1][curr.y]==0){
                    q.offer(new Pair(curr.x+1,curr.y));
                    grid[curr.x+1][curr.y]=1;
                }
                if(curr.x-1>=0 && grid[curr.x-1][curr.y]==0){
                    q.offer(new Pair(curr.x-1,curr.y));
                    grid[curr.x-1][curr.y]=1;
                }
                if(curr.y+1<grid.length && grid[curr.x][curr.y+1]==0){
                    q.offer(new Pair(curr.x,curr.y+1));
                    grid[curr.x][curr.y+1]=1;
                }
                if(curr.y-1>=0 && grid[curr.x][curr.y-1]==0){
                    q.offer(new Pair(curr.x,curr.y-1));
                    grid[curr.x][curr.y-1]=1;
                }
            }
            level++;
        }
        return level-1;
    }
}
