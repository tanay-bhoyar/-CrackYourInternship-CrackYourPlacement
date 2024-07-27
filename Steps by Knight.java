class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n)
    {
        // Code here
        TargetPos[0]=TargetPos[0]-1;
        TargetPos[1]=TargetPos[1]-1;
        KnightPos[0]=KnightPos[0]-1;
        KnightPos[1]=KnightPos[1]-1;
        boolean visited[][]=new boolean[n][n];
        if(KnightPos[0]==TargetPos[0] && KnightPos[1]==TargetPos[1]){
            return 0;
        }
        Queue<int[]>q=new LinkedList<>();
        int count=0;
        q.offer(KnightPos);
        while(!q.isEmpty()){
            int size=q.size();
            count++;
            for(int i=0;i<size;i++){
                int curr[]=q.poll();
                if(visited[curr[0]][curr[1]]){
                    continue;
                }
                visited[curr[0]][curr[1]]=true;
                if(curr[0]+2<n && curr[1]+1<n){
                    int arr[]=new int[2];
                    arr[0]=curr[0]+2;
                    arr[1]=curr[1]+1;
                    if(arr[0]==TargetPos[0] && arr[1]==TargetPos[1]){
                        return count;
                    }else{
                        q.offer(arr);
                    }
                }
                if(curr[0]+1<n && curr[1]+2<n){
                    int arr[]=new int[2];
                    arr[0]=curr[0]+1;
                    arr[1]=curr[1]+2;
                    if(arr[0]==TargetPos[0] && arr[1]==TargetPos[1]){
                        return count;
                    }else{
                        q.offer(arr);
                    }
                }
                if(curr[0]+2<n && curr[1]-1>=0){
                    int arr[]=new int[2];
                    arr[0]=curr[0]+2;
                    arr[1]=curr[1]-1;
                    if(arr[0]==TargetPos[0] && arr[1]==TargetPos[1]){
                        return count;
                    }else{
                        q.offer(arr);
                    }
                }
                if(curr[0]+1<n && curr[1]-2>=0){
                    int arr[]=new int[2];
                    arr[0]=curr[0]+1;
                    arr[1]=curr[1]-2;
                    if(arr[0]==TargetPos[0] && arr[1]==TargetPos[1]){
                        return count;
                    }else{
                        q.offer(arr);
                    }
                }
                if(curr[0]-1>=0 && curr[1]-2>=0){
                    int arr[]=new int[2];
                    arr[0]=curr[0]-1;
                    arr[1]=curr[1]-2;
                    if(arr[0]==TargetPos[0] && arr[1]==TargetPos[1]){
                        return count;
                    }else{
                        q.offer(arr);
                    }
                }
                if(curr[0]-2>=0 && curr[1]-1>=0){
                    int arr[]=new int[2];
                    arr[0]=curr[0]-2;
                    arr[1]=curr[1]-1;
                    if(arr[0]==TargetPos[0] && arr[1]==TargetPos[1]){
                        return count;
                    }else{
                        q.offer(arr);
                    }
                }
                if(curr[0]-1>=0 && curr[1]+2<n){
                    int arr[]=new int[2];
                    arr[0]=curr[0]-1;
                    arr[1]=curr[1]+2;
                    if(arr[0]==TargetPos[0] && arr[1]==TargetPos[1]){
                        return count;
                    }else{
                        q.offer(arr);
                    }
                }
                if(curr[0]-2>=0 && curr[1]+1<n){
                    int arr[]=new int[2];
                    arr[0]=curr[0]-2;
                    arr[1]=curr[1]+1;
                    if(arr[0]==TargetPos[0] && arr[1]==TargetPos[1]){
                        return count;
                    }else{
                        q.offer(arr);
                    }
                }
            }
        }
        return -1;
    }
}
