class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        boolean b[]=new boolean[arr.length+1];
        int res[]=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].deadline;j>=1;j--){
                if(!b[j]){
                    b[j]=true;
                    res[0]++;
                    res[1]+=arr[i].profit;
                    break;
                }
            }
        }
        return res;
    }
}
