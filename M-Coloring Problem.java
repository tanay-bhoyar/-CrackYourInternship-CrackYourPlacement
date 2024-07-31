class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int color[]=new int[graph.length];
        return helper(graph,m,color,0);
    }
    
    public boolean helper(boolean graph[][],int m,int color[],int v){
        if(v==graph.length){
            return true;
        }
        for(int i=1;i<=m;i++){
            if(isSafe(graph,v,color,i)){
                color[v]=i;
                if(helper(graph,m,color,v+1)){
                    return true;
                }
                color[v]=0;
            }
        }
        return false;
    }
    
    public boolean isSafe(boolean graph[][],int v,int color[],int c){
        for(int i=0;i<graph.length;i++){
            if(graph[v][i] && c==color[i]){
                return false;
            }
        }
        return true;
    }
    
}
