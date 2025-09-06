class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solveMinPathSumM(m-1, n-1, grid, dp);

        // return solveMinPathSum(m-1, n-1, grid);
    }

    int solveMinPathSumM(int i, int j, int[][] grid, int[][] dp){
        if(i==0 && j==0){
            return grid[i][j];
        }
        if(i<0 || j<0){
            return (int)1e9;
        }
        if(dp[i][j]!=-1){
            return  dp[i][j];
        }
        int up = grid[i][j] + solveMinPathSumM(i-1,j,grid,dp);
        int left = grid[i][j] + solveMinPathSumM(i,j-1,grid,dp);
         return dp[i][j] = Math.min(up,left);
    }
    
    // int solveMinPathSum(int i, int j, int[][] grid){
    //     if(i==0 && j==0){
    //         return grid[i][j];
    //     }
    //     if(i<0 || j<0){
    //         return (int)1e9;
    //     }
    //     int up = grid[i][j] + solveMinPathSum(i-1,j,grid);
    //     int left = grid[i][j] + solveMinPathSum(i,j-1,grid);
    //      return Math.min(up,left);
    // }
}