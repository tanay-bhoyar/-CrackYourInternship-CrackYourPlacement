

class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        boolean visited[]=new boolean[V];
        List<Integer> check= order(adj,visited,V);
        ArrayList<ArrayList<Integer>> rev=reverse(adj, V);
        visited=new boolean[V];
        Collections.reverse(check);
        List<List<Integer>>SCC=new ArrayList<>();
        for(int i=0;i<check.size();i++){
            int v=check.get(i);
            if(!visited[v]){
                List<Integer>comp=new ArrayList<>();
                helper(rev,visited,v,comp);
                SCC.add(comp);
            }
        }
        return SCC.size();
    }
    
    public ArrayList<ArrayList<Integer>> reverse(ArrayList<ArrayList<Integer>>adj,int V){
        ArrayList<ArrayList<Integer>> rev=new ArrayList<>();
        for(int i=0;i<V;i++){
            rev.add(i,new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<adj.get(i).size();j++){
                rev.get(adj.get(i).get(j)).add(i);
            }
        }
        return rev;
    }
    
    public  List<Integer> order(ArrayList<ArrayList<Integer>>adj,boolean visited[],int V){
        List<Integer>order=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                helper(adj,visited,i,order);
            }
        }
        return order;
    }
    
    public void helper(ArrayList<ArrayList<Integer>>adj,boolean visited[],int curr,List<Integer>comp){
        visited[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
            if(!visited[adj.get(curr).get(i)]){
                helper(adj,visited,adj.get(curr).get(i),comp);
            }
        }
        comp.add(curr);
    }
    
}
