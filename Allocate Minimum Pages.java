// User function Template for Java

class Solution {
    // Function to find minimum number of pages.
    public static long findPages(int n, int[] arr, int m) {
        long sum=0;
        if(n<m){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            min=Math.min(arr[i],min);
        }
        long start=0;
        long end=sum;
        long ans=Integer.MAX_VALUE;
        while(start<=end){
            long mid=(start+end)/2;
            if(helper(arr,mid,m)){
                ans=Math.min(ans,mid);
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        // Your code here
        return ans;
    }
    
    public static boolean helper(int arr[],long mid,int m){
        int students=1;
        long currsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid){
                return false;
            }
            currsum=currsum+arr[i];
            if(currsum>mid){
                currsum=arr[i];
                students++;
                if(students>m){
                    return false;
                }
            }
        }
        return true;
    }
    
};
