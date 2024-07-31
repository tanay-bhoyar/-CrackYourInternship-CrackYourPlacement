class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<Integer>[]adj=new ArrayList[n];
        for(int i=0;i<adj.length;i++){
            adj[i]=new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            if(i==headID){
                continue;
            }
            adj[manager[i]].add(i);
        }
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{headID,informTime[headID]});
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int[]curr=q.poll();
            int currp=curr[0];
            int currt=curr[1];
            max=Math.max(currt,max);
            ArrayList<Integer> check = adj[currp];
            for(int i=0;i<check.size();i++){
                q.offer(new int[]{check.get(i),currt+informTime[check.get(i)]});
            }
        }
        return max;
    }
}
