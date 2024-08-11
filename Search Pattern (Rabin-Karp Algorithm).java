//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==pattern.charAt(0)){
                if(i+pattern.length()<=text.length() && text.substring(i,i+pattern.length()).equals(pattern)){
                    ans.add(i+1);
                }
            }
        }
        return ans;
    }
}
