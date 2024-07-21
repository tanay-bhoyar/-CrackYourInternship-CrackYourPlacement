
//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here
    	int count1[]=new int[M.length];
    	int count2[]=new int[M.length];
    	for(int i=0;i<M.length;i++){
    	    for(int j=0;j<M.length;j++){
    	        if(i==j){
    	            continue;
    	        }
    	        if(M[i][j]==1){
    	            count1[i]++;
    	            count2[j]++;
    	        }
    	    }
    	}
    	
    	for(int i=0;i<count1.length;i++){
    	    if(count2[i]==M.length-1 && count1[i]==0){
    	        return i;
    	    }
    	}
    	return -1;
    }
}
