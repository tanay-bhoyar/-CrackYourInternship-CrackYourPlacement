class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        if(haystack.equals(needle)){
            return 0;
        }
        for(int j=0;j<haystack.length()-needle.length()+1;j++){
            String curr=haystack.substring(j,j+needle.length());
            if(curr.equals(needle)){
                return j;
            }
        }
        return -1;
    }
}
