/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    private List<Integer> ans;
    int index;
    public NestedIterator(List<NestedInteger> nestedList) {
        ans=new ArrayList<>();
        index=0;
        ans=helper(nestedList);
    }

    public List<Integer> helper(List<NestedInteger> nested){
        List<Integer> result=new ArrayList<>();
        for(NestedInteger i:nested){
            if(i.isInteger()){
                result.add(i.getInteger());
            }else{
                result.addAll(helper(i.getList()));
            }
        }
        return result;
    }

    @Override
    public Integer next() {
        return ans.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index<ans.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
