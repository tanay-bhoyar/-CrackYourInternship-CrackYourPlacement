class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;                
            }
        }

        int i=0;
        int j=matrix[0].length-1;
        while(i<j){
            for(int x=0;x<matrix.length;x++){
                int tem=matrix[x][i];
                matrix[x][i]=matrix[x][j];
                matrix[x][j]=tem;
            }
            i++;
            j--;
        }

    }
}
