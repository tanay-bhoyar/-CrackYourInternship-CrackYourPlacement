class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>check = new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                check.add(matrix[i][j]);
            }
        }
        while(k>1){
            check.poll();
            k--;
        }
        return check.peek();
    }
}
