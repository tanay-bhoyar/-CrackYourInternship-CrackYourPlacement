class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    ArrayList<Integer> ans = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        boolean visited[]=new boolean[V];
        helper(adj,visited,0);
        return ans;
        // Code here
    }
    
    public void helper(ArrayList<ArrayList<Integer>> adj,boolean visited[],int curr){
        visited[curr]=true;
        ans.add(curr);
        for(int i=0;i<adj.get(curr).size();i++){
            if(visited[adj.get(curr).get(i)]==false){
                helper(adj,visited,adj.get(curr).get(i));
            }
        }
    }
    
}
