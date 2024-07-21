class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []freq=new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        Arrays.sort(freq);
        int maxfreq=freq[freq.length-1]-1;
        int idle=maxfreq*n;
        for(int i=freq.length-2;i>=0 && freq[i]>0;i--){
            idle=idle-Math.min(freq[i],maxfreq);
        }
        if(idle>0){
            return idle+tasks.length;
        }else{
            return tasks.length;
        }
    }
}
