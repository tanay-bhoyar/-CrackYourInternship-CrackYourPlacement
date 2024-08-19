
class Solution
{
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        //code here
        if(edges.length<=1){
            return 0;
        }
        
        HashMap<Integer,ArrayList<ArrayList<Integer>>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        ArrayList<Integer> a;
        for(int i=0;i<edges.length;i++){
            a = new ArrayList<>();
            a.add(edges[i][1]);
            a.add(edges[i][2]);
            map.get(edges[i][0]).add(a);
        }
        
        for(int i=0;i<n;i++){
            if(bfs(map,n,i)==1){
                return 1;
            }
        }
        return 0;
    }
    public static int bfs(HashMap<Integer,ArrayList<ArrayList<Integer>>> map,int n,int i){
        Queue<Integer> q = new LinkedList<>();
        int pathLength[] = new int[n];
        int nCycle[] = new int[n];
        boolean visited[] = new boolean[n];
        Arrays.fill(pathLength,Integer.MAX_VALUE);
        
        q.add(i);
        pathLength[i] = 0;
        while(!q.isEmpty()){
            int val = q.poll();
            ArrayList<ArrayList<Integer>> list = map.get(val);
            for(ArrayList<Integer> it : list){
                if(pathLength[val]+it.get(1) < pathLength[it.get(0)]){
                    pathLength[it.get(0)] = pathLength[val]+it.get(1);
                    q.add(it.get(0));
                    nCycle[it.get(0)]++;
                    if(nCycle[val]>n){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
