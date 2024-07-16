class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int i=0;
        int j=m-1;
        int min=Integer.MAX_VALUE;
        while(j<a.size()){
            int diff=a.get(j)-a.get(i);
            min=Math.min(diff,min);
            i++;
            j++;
        }
        return min;
    }
}
