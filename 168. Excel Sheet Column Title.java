class Solution {
    public String convertToTitle(int columnNumber) {
        String ans="";
        while(columnNumber>0){
            columnNumber--;
            char c=(char)('A'+columnNumber%26);
            ans=c+ans;
            columnNumber=columnNumber/26;
        }
        return ans;
    }
}
