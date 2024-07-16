class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='+'){
                int curr=st.pop();
                int prev=st.pop();
                st.push(curr+prev);
            }
            else if(S.charAt(i)=='-'){
                int curr=st.pop();
                int prev=st.pop();
                st.push(prev-curr);
            }else if(S.charAt(i)=='*'){
                int curr=st.pop();
                int prev=st.pop();
                st.push(curr*prev);
            }else if(S.charAt(i)=='/'){
                int curr=st.pop();
                int prev=st.pop();
                st.push(prev/curr);
            }else{
                st.push(S.charAt(i)-'0');
            }
        }
        return st.peek();
        // Your code here
    }
}
