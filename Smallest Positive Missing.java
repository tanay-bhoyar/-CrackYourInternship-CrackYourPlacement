class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        int ans=1;
        Set<Integer> check = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            check.add(arr[i]);
        }
        while(check.contains(ans)){
            ans++;
        }
        return ans;
        // Your code here
    }
}
