//User function template for JAVA

class Solution
{
    public void shortest_distance(int[][] matrix)
    {
        // Code here 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=100000;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                for(int k=0;k<matrix.length;k++){
                    matrix[j][k]=Math.min(matrix[j][k],matrix[j][i]+matrix[i][k]);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==100000){
                    matrix[i][j]=-1;
                }
            }
        }
    }
}
