class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(ans,new ArrayList<>(),0,s);
        return ans;
    }

    public void helper(List<List<String>> ans ,List<String> x,int start,String s){
        if(start==s.length()){
            ans.add(new ArrayList<>(x));
            return;
        }
        for(int i=start+1;i<=s.length();i++){
            if(check(s,start,i-1)){
                x.add(s.substring(start,i));
                helper(ans,x,i,s);
                x.remove(x.size()-1);
            }
        }
    }

    public boolean check(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
