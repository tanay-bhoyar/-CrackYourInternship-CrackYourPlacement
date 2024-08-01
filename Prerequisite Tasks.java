
//User function Template for Java

class Solution {
    public boolean isPossible(int N,int P, int[][] prerequisites)
    {
        // Your Code goes here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        boolean visited[]=new boolean[N];
        boolean st[]=new boolean[N];
        for(int i=0;i<N;i++){
            if(helper(adj,visited,st,i)){
                return false;
            }
        }
        return true;
    }
    
    public boolean helper(ArrayList<ArrayList<Integer>>adj,boolean visited[],boolean st[],int curr){
        if(st[curr]){
            return true;
        }
        if(visited[curr]){
            return false;
        }
        visited[curr]=true;
        st[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
            if(helper(adj,visited,st,adj.get(curr).get(i))){
                return true;
            }
        }
        st[curr]=false;
        return false;
    }
    
}
