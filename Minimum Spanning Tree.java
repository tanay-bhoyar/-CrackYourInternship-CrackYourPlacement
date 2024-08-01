// User function Template for Java

class Solution {
    
    static class Pair{
        int node;
        int count;
        Pair(int node,int count){
            this.node=node;
            this.count=count;
        }
    }
    
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.count-b.count);
        int ans=0;
        boolean visited[]=new boolean[V];
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            if(visited[curr.node]){
                continue;
            }
            ans=ans+curr.count;
            visited[curr.node]=true;
            for(int i=0;i<adj.get(curr.node).size();i++){
                if(!visited[adj.get(curr.node).get(i)[0]]){
                    pq.add(new Pair(adj.get(curr.node).get(i)[0],adj.get(curr.node).get(i)[1]));
                }
            }
        }
        return ans;
    }
}
