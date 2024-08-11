class RandomizedCollection {
    List<Integer> list;
    HashMap<Integer,Set<Integer>> hm;

    public RandomizedCollection() {
        list=new ArrayList<>();
        hm=new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(!hm.containsKey(val)){
            hm.put(val,new HashSet<>());
        }
        hm.get(val).add(list.size());
        list.add(val);
        return hm.get(val).size()==1;
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val) || hm.get(val).isEmpty()){
            return false;
        }
        int rem=hm.get(val).iterator().next();
        hm.get(val).remove(rem);
        int last=list.get(list.size()-1);
        list.set(rem,last);
        hm.get(last).add(rem);
        hm.get(last).remove(list.size()-1);
        list.remove(list.size()-1);
        return true;
    }
    
    public int getRandom() {
        int random=(int)(Math.random()*list.size());
        return list.get(random);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
