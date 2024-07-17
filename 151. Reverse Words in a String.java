class Solution {
    public String reverseWords(String s) {
        Stack<String> check= new Stack<>();
        String str="";
        String ans="";
        if(s.length()==0){
            return s;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && str.length()!=0){
                check.push(str);
                str="";
                continue;
            }
            if(s.charAt(i)==' ' && str.length()==0){
                continue;
            }
            str=str+s.charAt(i);
            if(i==s.length()-1){
                check.push(str);
            }
        }
        while(!check.isEmpty()){
            ans=ans+check.pop()+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}
