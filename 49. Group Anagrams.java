class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[]c=strs[i].toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!mp.containsKey(s)){
                mp.put(s,new ArrayList<>());
                mp.get(s).add(strs[i]);
            }else{
                mp.get(s).add(strs[i]);
            }
        }
        for(Map.Entry<String,List<String>>i:mp.entrySet()){
            ans.add(i.getValue());
        }
        return ans;
    }
}
