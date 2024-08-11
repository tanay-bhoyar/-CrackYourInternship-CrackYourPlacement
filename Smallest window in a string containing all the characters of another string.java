class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String t)
    {
        // Your code here
        if(s.length()<t.length()){
            return "-1";
        }
        if(s.equals(t)){
            return s;
        }
        HashMap<Character,Integer> m1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            m1.put(t.charAt(i),m1.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character,Integer>m2=new HashMap<>();
        String ans=s;
        int count=0;
        int j=0;
        int i=0;
        int minlen=Integer.MAX_VALUE;
        boolean b=false;
        while(j<s.length()){
            char c=s.charAt(j);
            m2.put(s.charAt(j),m2.getOrDefault(s.charAt(j),0)+1);
            if(m1.containsKey(c) && m2.get(c) == m1.get(c)){
                count++;
            }
            while(count==m1.size()){
                b=true;
                if(j-i+1<minlen){
                    minlen=j-i+1;
                    ans=s.substring(i,j+1);
                }
                char x=s.charAt(i);
                m2.put(x,m2.get(x)-1);
                if(m1.containsKey(x) && m2.get(x)<m1.get(x)){
                    count--;
                }
                i++;
            }
            j++;
        }      
        if(i==0 && j==s.length()){
            return "-1";
        }
        return ans;
    }
}
