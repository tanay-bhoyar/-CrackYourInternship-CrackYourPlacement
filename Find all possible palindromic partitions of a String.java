//User function Template for Java

class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        // code here
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> x=new ArrayList<>();
        helper(S,0,ans,x);
        return ans;
    }
    static boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void helper(String s,int i,ArrayList<ArrayList<String>>ans,ArrayList<String>x){
        if(i==s.length()){
            ans.add(new ArrayList<>(x));
            return;
        }
        String temp="";
        for(int j=i;j<s.length();j++){
            temp+=s.charAt(j);
            if(check(temp)){
                x.add(temp);
                helper(s,j+1,ans,x);
                x.remove(x.size()-1);
            }
        }
    }
};
