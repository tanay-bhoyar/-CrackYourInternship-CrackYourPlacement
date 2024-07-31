class Solution {
    public int removeStones(int[][] stones) {
        if(stones.length<=1){
            return 0;
        }
        List<Integer>[]adj=new ArrayList[stones.length];
        for(int i=0;i<stones.length;i++){
            adj[i]=new ArrayList<>();
        }
        for(int i=0;i<stones.length;i++){
            int []u=stones[i];
            for(int j=0;j<stones.length;j++){
                if(i==j){
                    continue;
                }
                int v[]=stones[j];
                if(u[0]==v[0] || u[1]==v[1]){
                    adj[i].add(j);
                }
            }
        }
        boolean[]visited=new boolean[stones.length];
        int ans=0;
        for(int i=0;i<stones.length;i++){
            if(visited[i]){
                continue;
            }
            helper(adj,visited,i);
            ans++;
        }
        return stones.length-ans;
    }

    public void helper(List<Integer>[]adj,boolean visited[],int curr){
        visited[curr]=true;
        for(int i=0;i<adj[curr].size();i++){
            if(visited[adj[curr].get(i)]){
                continue;
            }
            helper(adj,visited,adj[curr].get(i));
        }
    }

}
