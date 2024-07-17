class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        for(int i=0;i<cardPoints.length;i++){
            total+=cardPoints[i];
        }
        int sum=0;
        for(int i=0;i<cardPoints.length-k;i++){
            sum+=cardPoints[i];
        }
        int minsum=sum;
        int i=0;
        int j=cardPoints.length-k;
        while(j<cardPoints.length){
            sum=sum-cardPoints[i];
            sum=sum+cardPoints[j];
            minsum=Math.min(minsum,sum);
            i++;
            j++;
            System.out.println(sum);
        }
        return total-minsum;
    }
}
