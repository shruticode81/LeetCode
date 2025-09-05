class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solveUniquePathWithObsM(m-1,n-1, obstacleGrid, dp);

        // return solveUniquePathWithObs(m-1,n-1, obstacleGrid);
    }
    int solveUniquePathWithObsM(int i, int j, int[][] grid, int[][] dp){
        if(i>=0 && j>=0 && grid[i][j]==1) return 0;
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int up = solveUniquePathWithObsM(i-1,j,grid, dp);
        int left = solveUniquePathWithObsM(i,j-1, grid, dp);
        return dp[i][j]=up+left;

    }
    // int solveUniquePathWithObs(int i, int j, int[][] grid){
    //     if(i>=0 && j>=0 && grid[i][j]==1) return 0;
    //     if(i==0 && j==0){
    //         return 1;
    //     }
    //     if(i<0 || j<0){
    //         return 0;
    //     }

    //     int up = solveUniquePathWithObs(i-1,j,grid);
    //     int left = solveUniquePathWithObs(i,j-1, grid);
    //     return up+left;
    // }
}