class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean visited[]=new boolean[graph.length];
        boolean instack[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            helper(i,graph,visited,instack);
        }
        List<Integer>safe=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(!instack[i]){
                safe.add(i);
            }
        }
        return safe;
    }

    public boolean helper(int curr,int[][]graph,boolean visited[],boolean instack[]){
        if(instack[curr]){
            return true;
        }
        if(visited[curr]){
            return false;
        }
        visited[curr]=true;
        instack[curr]=true;
        for(int i=0;i<graph[curr].length;i++){
            if(helper(graph[curr][i],graph,visited,instack)){
                return true;
            }
        }
        instack[curr]=false;
        return false;
    }

}
