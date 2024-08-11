class Solution {
    HashMap<String,Integer>check = new HashMap<>();
    public int numDistinct(String s, String t) {
        return helper(s,t,0,0);
    }
    public int helper(String s,String t,int i,int j){
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
        String curr=Integer.toString(i)+","+Integer.toString(j);
        if(check.containsKey(curr)){
            return check.get(curr);
        }
        int count=0;
        if(s.charAt(i)==t.charAt(j)){
            count=helper(s,t,i+1,j+1)+helper(s,t,i+1,j);
            check.put(curr,count);
            return count;
        }else{
            count=helper(s,t,i+1,j);
            check.put(curr,count);
            return count;
        }
    }
}
