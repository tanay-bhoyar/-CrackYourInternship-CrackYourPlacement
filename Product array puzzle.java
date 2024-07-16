class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    int count=0;
	    
	    long prod=1;
	    for(int i=0;i<nums.length;i++){
	        prod*=nums[i];    
	    }
	    if(prod==0){
	        for(int i=0;i<nums.length;i++){
    	        if(nums[i]==0){
    	            count++;
    	        }
    	    }
    	    long ans[] = new long[nums.length];
    	    if(count>1){
    	        return ans;
    	    }
    	    if(count==1){
    	        for(int i=0;i<nums.length;i++){
    	            if(nums[i]==0){
    	                long l=1;
    	                for(int j=0;j<nums.length;j++){
    	                    if(i==j){
    	                        continue;
    	                    }l*=nums[j];
    	                }
    	                ans[i]=l;
    	                return ans;
    	            }
    	        }
    	    }
	    }
	    
	    long ans[]=new long[nums.length];
	    for(int i=0;i<nums.length;i++){
	        ans[i]=prod/nums[i];
	    }
	    return ans;
        // code here
	} 
} 
