class Solution {
    public int countSquares(int[][] matrix) {
        
        int count=0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                count = count + bfs(matrix,i,j,dp);
            }
        }
        return count;
        
    }
    public int bfs(int[][] matrix, int i,int j,int[][] dp){
        if((i>=matrix.length)||(j>=matrix[0].length)||(matrix[i][j]==0)){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        return dp[i][j] = 1+Math.min(Math.min(bfs(matrix,i,j+1,dp),bfs(matrix,i+1,j,dp)),bfs(matrix,i+1,j+1,dp));
    }

    
}
