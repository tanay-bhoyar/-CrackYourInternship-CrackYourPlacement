class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            mp.put(nums2[i],i);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=-1;
        }
        for(int i=0;i<nums1.length;i++){
            boolean b=false;
            for(int j=mp.get(nums1[i]);j<nums2.length && b==false;j++){
                if(nums2[j]>nums1[i]){
                    ans[i]=nums2[j];
                    b=true;
                }
            }
        }
        return ans;
    }
}
