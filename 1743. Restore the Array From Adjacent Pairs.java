class Solution {
    public int[] restoreArray(int[][] adj) {
        int arr[]=new int[adj.length+1];
        HashMap<Integer,List<Integer>>check = new HashMap<>();
        for(int i=0;i<adj.length;i++){
            check.put(adj[i][0],new ArrayList<>());
            check.put(adj[i][1],new ArrayList<>());
        }
        for(int i=0;i<adj.length;i++){
            check.get(adj[i][0]).add(adj[i][1]);
            check.get(adj[i][1]).add(adj[i][0]);
        }
        for(Map.Entry<Integer,List<Integer>>i:check.entrySet()){
            if(i.getValue().size()==1){
                arr[0]=i.getKey();
                break;
            }
        }
        System.out.println(check);
        for(int i=0;i<arr.length-1;i++){
            List<Integer>curr=check.get(arr[i]);
            System.out.println(curr);
            if(curr.size()>1){
                if(i-1>=0 && arr[i-1]==curr.get(0)){
                    arr[i+1]=curr.get(1);
                }else{
                    arr[i+1]=curr.get(0);
                }
            }else{
                arr[i+1]=check.get(arr[i]).get(0);
            }
        }
        return arr;
    }
}
