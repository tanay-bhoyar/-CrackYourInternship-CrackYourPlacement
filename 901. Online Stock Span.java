class StockSpanner {
    int count=1;
    List<Integer> check = new ArrayList<>();
    int max=Integer.MIN_VALUE;
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        check.add(price);
        int count=0;
        for(int i=check.size()-1;i>=0;i--){
            if(check.get(i)<=price){
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
