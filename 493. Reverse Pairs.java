class Solution {
    public int reversePairs(int[] nums) {
        return merger(0,nums.length-1,nums);
    }

    private int merger(int start,int end,int arr[]){
        if(start>=end){
            return 0;
        }
        int mid=(start+end)/2;
        int cnt = merger(start,mid,arr);
        cnt+=merger(mid+1,end,arr);
        cnt+=merge(start,mid,end,arr);
        return cnt;
    }

    private int merge(int start,int mid,int end,int[]arr){
        int ans=0;
        int j=mid+1;
        for(int i=start;i<=mid;i++){
            while(j<=end && arr[i]>(2*(long)arr[j])){
                j++;
            }
            ans+=j-(mid+1);
        }
        List<Integer> list=new ArrayList<>();
        int i=start;
        j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                list.add(arr[i++]);
            }else{
                list.add(arr[j++]);
            }
        }
        while(i<=mid){
            list.add(arr[i++]);
        }
        while(j<=end){
            list.add(arr[j++]);
        }
        for(int x=start;x<=end;x++){
            arr[x]=list.get(x-start);
        }
        return ans;
    }
}
