/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[]=new boolean[V];
        boolean rec[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(helper(i,adj,rec,visited)){
                return true;
            }
        }
        return false;
    }
    
    public boolean helper(int curr,ArrayList<ArrayList<Integer>> adj, boolean[]rec,boolean visited[]){
        if(rec[curr]){
            return true;
        }
        if(visited[curr]){
            return false;
        }
        visited[curr]=true;
        rec[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
            if(helper(adj.get(curr).get(i),adj,rec,visited)){
                return true;
            }
        }
        rec[curr]=false;
        return false;
    }
    
}
