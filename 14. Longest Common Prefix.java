class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            min=Math.min(strs[i].length(),min);
        }
        String ans="";
        for(int i=0;i<min;i++){
            boolean b=false;
            for(int j=0;j<strs.length-1 && b==false;j++){
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                    b=true;
                }
            }
            if(b==true){
                break;
            }else{
                ans+=strs[0].charAt(i);
            }
        }
        return ans;
    }
}
