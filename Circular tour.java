// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	    int check[] = new int[distance.length];
	    for(int i=0;i<distance.length;i++){
	        check[i]=petrol[i]-distance[i];
	    }
	    int sum=0;
	    for(int i=0;i<check.length;i++){
	        sum+=check[i];
	    }
	    if(sum<0){
	        return -1;
	    }
	    int i=0;
	    int j=1;
	    sum=check[0];
	    while(i!=j){
	        while(i!=j && sum<0){
	            sum-=check[i];
	            i=(i+1)%distance.length;
	        }
	        sum+=check[j];
	        j=(j+1)%distance.length;
	    }
	    return i;
    }
}
