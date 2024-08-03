class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>check = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(check.containsKey(s.charAt(i))){
                check.put(s.charAt(i),check.get(s.charAt(i))+1);
            }else{
                check.put(s.charAt(i),1);
            }
            
        }
        List<Integer>list = new ArrayList<>();
        for(Map.Entry<Character,Integer>i:check.entrySet()){
            list.add(i.getValue());
        }
        Collections.sort(list);
        int ans=0;
        Set<Integer>set = new HashSet<>();
        for(int i=0;i<list.size();i++){
            if(!set.contains(list.get(i))){
                set.add(list.get(i));
            }else{
                int count=1;
                int curr=list.get(i);
                boolean b=false;
                while(set.contains(curr) && b==false){
                    if(curr-count==0 || !set.contains(curr-count)){
                        set.add(curr-count);
                        b=true;
                        continue;
                    }
                    count++;
                    
                }
                ans+=count;
            }
            
        }
        return ans;
    }
}
