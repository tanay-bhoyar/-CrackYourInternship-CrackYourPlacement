class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=b.length-1;
        while(j>=0){
            if(a[i]+b[j]<k){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
