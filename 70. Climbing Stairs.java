class Solution {

    int count=0;
    HashMap<Integer,Integer> check = new HashMap<>();
    public int climbStairs(int n) {
        helper(n);
        return count;
    }

    public void helper(int n){
        if(n<0){
            return;
        }
        if(check.containsKey(n)){
            count=count+check.get(n);
            return;
        }
        if(n==0){
            count++;
        }
        helper(n-1);
        helper(n-2);
        check.put(n,count);
    }

}
