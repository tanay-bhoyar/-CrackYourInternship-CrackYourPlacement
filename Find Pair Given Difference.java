class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Set<Integer> check = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(check.contains(arr[i]-x)||check.contains(x+arr[i])){
                return 1;
            }
            check.add(arr[i]);
        }
        return -1;
    }
}
