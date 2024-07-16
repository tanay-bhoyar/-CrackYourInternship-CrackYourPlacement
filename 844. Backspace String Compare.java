class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty() && s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }else if(st.isEmpty() && s.charAt(i)=='#'){
                continue;
            }else if(!st.isEmpty() && s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }else{
                st.pop();
            }
        }
        System.out.println(st);
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(st2.isEmpty() && t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }else if(st2.isEmpty() && t.charAt(i)=='#'){
                continue;
            }else if(!st2.isEmpty() && t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }else{
                st2.pop();
            }
        }
        return st.equals(st2);
    }
}
