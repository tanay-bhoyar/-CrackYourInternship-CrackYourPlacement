//User function Template for Java

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        
        HashMap<String,List<String>> mp=new HashMap<>();
        List<List<String>> ans= new ArrayList<>();
        for(int i=0;i<string_list.length;i++){
            char c[]=string_list[i].toCharArray();
            Arrays.sort(c);
            String str=new String(c);
            if(mp.containsKey(str)){
                mp.get(str).add(string_list[i]);
            }else{
                mp.put(str,new ArrayList<>());
                mp.get(str).add(string_list[i]);
            }
        }
        for(Map.Entry<String,List<String>> i:mp.entrySet()){
            ans.add(i.getValue());
        }
        return ans;
        // Code here
    }
}
