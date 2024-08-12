class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer>res=new ArrayList<>();
        Deque<Integer> deq=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(!deq.isEmpty() && deq.getLast()<num){
                deq.pollLast();
            }
            deq.addLast(num);
            if(i>=k && nums[i-k]==deq.getFirst()){
                deq.pollFirst();
            }
            if(i>=k-1){
                res.add(deq.getFirst());
            }
        }
        int curr[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            curr[i]=res.get(i);
        }
        return curr;
    }
}
