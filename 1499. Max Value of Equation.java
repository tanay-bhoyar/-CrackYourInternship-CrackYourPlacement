class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int ans = Integer.MIN_VALUE;
        int x = 0;
        int i=0;
        while(i<points.length){
            if(x<=i){
                x=i+1;
            }
            for(int j=x;j<points.length;j++){
                if((points[j][0]-points[i][0])>k){
                    break;
                }
                int total = points[j][1]+points[i][1]+Math.abs(points[j][0]-points[i][0]);
                if(total>ans){
                    ans=total;
                    x=j;                }
            }
            i++;
        }
        return ans;
    }
}
