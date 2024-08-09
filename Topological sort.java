/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        boolean visited[]=new boolean[V];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(adj,i,st,visited);
            }
        }
        int ans[]=new int[st.size()];
        int i=0;
        while(!st.isEmpty()){
            ans[i]=st.pop();
            i++;
        }
        return ans;
    }
    static void dfs(ArrayList<ArrayList<Integer>>adj,int curr,Stack<Integer>st,boolean visited[]){
        visited[curr]=true;
        for(int i=0;i<adj.get(curr).size();i++){
            if(!visited[adj.get(curr).get(i)]){
                dfs(adj,adj.get(curr).get(i),st,visited);
            }
        }
        
                st.push(curr);
    }
}
