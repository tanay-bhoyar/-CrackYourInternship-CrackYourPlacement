class Solution {
    class Pair{
        int num;
        int count;
        Pair(int num,int count){
            this.num=num;
            this.count=count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(check.containsKey(nums[i])){
                check.put(nums[i],check.get(nums[i])+1);
            }else{
                check.put(nums[i],1);
            }
        }
        List<Pair> l=new ArrayList<>();
        for(Map.Entry<Integer,Integer> i:check.entrySet()){
            l.add(new Pair(i.getKey(),i.getValue()));
        }
        Collections.sort(l,(a,b)->b.count-a.count);
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=l.get(i).num;
        }
        return ans;
    }
}
