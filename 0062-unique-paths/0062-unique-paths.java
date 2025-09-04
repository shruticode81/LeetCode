class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solveUniquePathsM(m-1,n-1,dp);
    }
      int solveUniquePathsM(int i, int j, int[][] dp){
        //base cond
        if(i==0 && j==0){
            return dp[i][j]=1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int up = solveUniquePathsM(i-1, j,dp);
        int left = solveUniquePathsM(i,j-1,dp);
        return dp[i][j] = up+left;
    }

    // int solveUniquePaths(int i, int j){
    //     //base cond
    //     if(i==0 && j==0){
    //         return 1;
    //     }
    //     if(i<0 || j<0){
    //         return 0;
    //     }
    //     int up = solveUniquePaths(i-1, j);
    //     int left = solveUniquePaths(i,j-1);
    //     return up+left;
    // }
}