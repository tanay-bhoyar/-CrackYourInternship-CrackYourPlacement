class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++){
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(connections[i][0]);
        }
        boolean visited[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                helper(visited,adj,i);
                count++;
            }
        }
        return count-1;
    }

    public void helper(boolean visited[],List<List<Integer>> adj,int curr){
        visited[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
            if(!visited[adj.get(curr).get(i)]){
                helper(visited,adj,adj.get(curr).get(i));
            }
        }
    }

}
