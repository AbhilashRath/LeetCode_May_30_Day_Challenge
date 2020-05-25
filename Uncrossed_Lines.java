class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int[][] dp = new int[A.length][B.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return mUL(A,B,0,0,dp);
    }
    public int mUL(int[] A, int[] B,int i,int j,int[][] dp){
        if((i>=A.length)||(j>=B.length)){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(A[i]==B[j]){
            return dp[i][j] = 1 + mUL(A,B,i+1,j+1,dp);
        }
        
        int left = mUL(A,B,i+1,j,dp);
        int right = mUL(A,B,i,j+1,dp);
        return dp[i][j] = Math.max(left,right);
        
    }
}
