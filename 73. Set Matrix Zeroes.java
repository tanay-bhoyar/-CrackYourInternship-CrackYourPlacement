class Solution {

    public void makeZero(int[][]matrix,int i,int j){
        for(int k=0;k<matrix.length;k++){
            matrix[k][j]=0;
        }
        for(int k=0;k<matrix[0].length;k++){
            matrix[i][k]=0;
        }
        return;
    }

    public void setZeroes(int[][] matrix) {
        HashSet<int[]> check = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int[] arr={i,j};
                    check.add(arr);
                }
            }
        }
        for(int[] i:check){
            makeZero(matrix,i[0],i[1]);
        }
        
    }
}
