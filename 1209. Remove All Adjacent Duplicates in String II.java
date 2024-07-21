class Solution {

    class Pair{
        char c;
        int count;
        Pair(char c,int count){
            this.c=c;
            this.count=count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Pair> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(new Pair(s.charAt(i),1));
            }else if(!st.isEmpty() && s.charAt(i)==st.peek().c){
                Pair curr=st.pop();
                curr.count=curr.count+1;
                st.push(curr);
                if(st.peek().count==k){
                    st.pop();
                }
            }else{
                st.push(new Pair(s.charAt(i),1));
            }
        }
        String ans="";
        while(!st.isEmpty()){
            Pair curr=st.pop();
            for(int i=0;i<curr.count;i++){
                ans=curr.c+ans;
            }
            
        }
        return ans;
    }
}
