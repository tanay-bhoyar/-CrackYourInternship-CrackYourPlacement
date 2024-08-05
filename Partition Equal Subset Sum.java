// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2==1){
            return 0;
        }
        Arrays.sort(arr);
        sum=sum/2;
        if(helper(arr,0,sum)){
            return 1;
        }
        return 0;
    }
    
    public static boolean helper(int arr[],int curr,int sum){
        if(sum==0){
            return true;
        }
        if(sum<0 || curr>=arr.length){
            return false;
        }
        return helper(arr,curr+1,sum-arr[curr]) || helper(arr,curr+1,sum);
    }
    
    
}
