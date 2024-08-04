class Solution {
    public int characterReplacement(String s, int k) {
        int ans =0;
        for(int i='A';i<='Z';i++){
            int r=0;int l=0;int count=0;
            while(l<s.length()){
                if(s.charAt(l)==i){
                    l++;
                }else if(count<k){
                    count++;
                    l++;
                }else if(s.charAt(r)==i){
                    r++;
                }else{
                    r++;
                    count--;
                }
                ans=Math.max(ans,l-r);
            }
            
        }
        return ans;
    }
}
