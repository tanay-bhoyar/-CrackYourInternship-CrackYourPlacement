
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(helper(adj,visited,i,-1)){
                return true;
            }
        }
        return false;
    }
    
    public boolean helper(ArrayList<ArrayList<Integer>> adj,boolean visited[],int curr,int par){
        visited[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
            if(visited[adj.get(curr).get(i)] && par!=adj.get(curr).get(i)){
                return true;
            }
            if(!visited[adj.get(curr).get(i)]){
                if(helper(adj,visited,adj.get(curr).get(i),curr)){
                    return true;
                }
            }
        }
        visited[curr]=false;
        return false;
    }
    
}
