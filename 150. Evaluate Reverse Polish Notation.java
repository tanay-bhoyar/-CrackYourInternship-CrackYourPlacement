class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int curr=st.pop();
                int prev=st.pop();
                if(tokens[i].equals("+")){
                    st.push(curr+prev);
                }else if(tokens[i].equals("-")){
                    st.push(prev-curr);
                }else if(tokens[i].equals("*")){
                    st.push(prev*curr);
                }else if(tokens[i].equals("/")){
                    st.push(prev/curr);
                }
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}
