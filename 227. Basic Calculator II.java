class Solution {
    public int calculate(String s) {
        Stack<Integer> st= new Stack<>();
        char c[]= s.toCharArray();
        char op='+';
        int curr=0;
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])){
                curr=curr*10+(c[i]-'0');
            }if(!Character.isDigit(c[i]) && c[i]!=' '|| i==c.length-1){
                if(op=='+'){
                    st.push(curr);
                }else if(op=='-'){
                    st.push(-curr);
                }else if(op=='*'){
                    st.push(st.pop()*curr);
                }else if(op=='/'){
                    st.push(st.pop()/curr);
                }
                op=c[i];
                curr=0;
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
