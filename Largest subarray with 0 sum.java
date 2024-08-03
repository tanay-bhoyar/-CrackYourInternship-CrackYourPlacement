class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer>check = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]==0 && ans==0){
                ans=1;
            }
            if(sum==0){
                ans=i+1;
            }
            if(check.containsKey(sum)){
                ans=Math.max(ans,i-check.get(sum));
            }else{
                check.put(sum,i);
            }
        }
        return ans;
    }
}
