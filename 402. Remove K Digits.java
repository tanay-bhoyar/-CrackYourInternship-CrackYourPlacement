class Solution {
    public String removeKdigits(String nums, int k) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<nums.length();i++){
            if(st.isEmpty()){
                st.push(nums.charAt(i));
                continue;
            }if(st.peek()>=nums.charAt(i) && k>0){
                while(!st.isEmpty() && st.peek()>nums.charAt(i) && k>0){
                    st.pop();
                    k--;
                }
                
            }
                st.push(nums.charAt(i));
        }
        if(st.isEmpty()){
            return "0";
        }
        while(k>0){
            st.pop();
            k--;
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        int i=0;
        while( i<ans.length()&& ans.charAt(i)=='0'){
            i++;
        }
        if(ans.substring(i).length()==0){
            return "0";
        }
        return ans.substring(i);
    }
}
