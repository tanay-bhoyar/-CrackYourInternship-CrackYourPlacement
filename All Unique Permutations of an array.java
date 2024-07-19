//User function Template for Java

class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        HashMap<Integer,Integer> check = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(check.containsKey(arr.get(i))){
                check.put(arr.get(i),check.get(arr.get(i))+1);
            }else{
                check.put(arr.get(i),1);
            }
        }
        helper(ans,x,check,arr);
        return ans;
    }
    
    static void helper(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> x,HashMap<Integer,Integer> check,ArrayList<Integer> arr){
        if(x.size()==arr.size()){
            ans.add(new ArrayList<>(x));
            return;
        }
        for(Map.Entry<Integer,Integer>i:check.entrySet()){
            if(i.getValue()>0){
                x.add(i.getKey());
                check.put(i.getKey(),check.get(i.getKey())-1);
                helper(ans,x,check,arr);
                x.remove(x.size()-1);
                check.put(i.getKey(),check.get(i.getKey())+1);
            }
        }
    }
    
};
