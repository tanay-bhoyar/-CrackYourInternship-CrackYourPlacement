
// User function Template for Java

class Solution {
    
    HashMap<String,Long>check = new HashMap<>();
    
    public long getCount(int n) {
        // Your code goes here
        char arr[][]={{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};
        long ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='*' || arr[i][j]=='#'){
                    continue;
                }
                ans+=helper(arr,i,j,n);
            }
        }
        return ans;
    }
    
    public long helper(char arr[][],int i,int j,int n){
        
        if(i>=arr.length || j>=arr[0].length|| i<0 || j<0 || arr[i][j]=='*' || arr[i][j]=='#' ){
            return 0;
        }if(n==1){
            return 1;
        }
        String key=Integer.toString(i)+','+Integer.toString(j)+','+Integer.toString(n);
        if(check.containsKey(key)){
            return check.get(key);
        }
        long count=0;
        
        count+=helper(arr,i,j,n-1);
        count+=helper(arr,i+1,j,n-1);
        count+=helper(arr,i-1,j,n-1);
        count+=helper(arr,i,j+1,n-1);
        count+=helper(arr,i,j-1,n-1);
        check.put(key,count);
        return count;
    }
    
}
