class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String arr[]=path.split("/");
        String ans = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("")){
                continue;
            }else if(arr[i].equals("..") && !st.isEmpty()){
                st.pop();
            }else if(arr[i].equals(".")){
                continue;
            }else if(arr[i].equals("..") && st.isEmpty()){
                continue;
            }else{
                st.push(arr[i]);
            }
        }
        
        while(!st.isEmpty()){
            ans='/'+st.pop()+ans;
        }
        if(ans==""){
            return "/";
        }
        return ans;
    }
}
