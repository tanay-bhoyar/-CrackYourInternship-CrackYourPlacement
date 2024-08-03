class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer>check = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(check.containsKey(s.charAt(i))){
                check.put(s.charAt(i),check.get(s.charAt(i))+1);
            }else{
                check.put(s.charAt(i),1);
            }
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->check.get(b)-check.get(a));
        for(Map.Entry<Character,Integer>i:check.entrySet()){
            pq.add(i.getKey());
        }
        String ans="";
        while(pq.size()>=2){
            char c1=pq.poll();
            char c2=pq.poll();
            ans=ans+c1;
            ans=ans+c2;
            check.put(c1,check.get(c1)-1);
            check.put(c2,check.get(c2)-1);
            if(check.get(c1)>0){
                pq.add(c1);
            }
            if(check.get(c2)>0){
                pq.add(c2);
            }
        }
        if(!pq.isEmpty()){
            char c=pq.poll();
            if(check.get(c)>1){
                return "";
            }
            ans=ans+c;
        }
        return ans;
    }
}
