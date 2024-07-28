class Solution {
    public String decodeString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<StringBuilder> st1=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int n=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                n=n*10+(s.charAt(i)-'0');
            }else if(s.charAt(i)=='['){
                st.push(n);
                n=0;
                st1.push(sb);
                sb=new StringBuilder();
            }else if(s.charAt(i)==']'){
                int k=st.pop();
                StringBuilder temp=sb;
                sb=st1.pop();
                while(k-->0){
                    sb.append(temp);
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
