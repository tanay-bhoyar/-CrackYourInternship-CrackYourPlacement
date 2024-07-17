class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[]visited=new boolean[adj.size()];
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        while(!q.isEmpty()){
            int curr=q.poll();
            if(!visited[curr]){
                ans.add(curr);
                ArrayList<Integer>x=adj.get(curr);
                for(int i=0;i<x.size();i++){
                    q.offer(x.get(i));
                }
            }
            
            
            visited[curr]=true;
        }
        return ans;
    }
}
