class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            double x = Math.sqrt((a[0]*a[0])+(a[1]*a[1]))-Math.sqrt((b[0]*b[0])+(b[1]*b[1]));
            if(x<0){
                return -1;
            }else{
                return 1;
            }
            
            });

        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
        }
        int ans[][]=new int[k][2];
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
}
