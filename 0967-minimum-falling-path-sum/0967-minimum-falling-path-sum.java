class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        // for(int j=0;j<matrix[0].length;j++){
        //     // min = Math.min(solveMinFallingPathSum(0,j,matrix), min);
        //     min = Math.min(solveMinFallingPathSumM(0,j,matrix,dp), min);

        // }
        
        // return min;
        return solveMinFallingPathSumDP(matrix, dp);
        
    }
        int solveMinFallingPathSumDP(int[][] matrix, int[][] dp){
        int row = matrix.length;
        int col = matrix[0].length;

        for(int j=0;j<col;j++){
            dp[row-1][j] = matrix[row-1][j];
        }

        for(int i=row-2;i>=0;i--){
            for(int j=0;j<col;j++){
                int down = matrix[i][j]+dp[i+1][j];
                int leftDiagonal = matrix[i][j];
                if(j>0){
                    leftDiagonal = leftDiagonal+dp[i+1][j-1];
                }else{
                    leftDiagonal = leftDiagonal+(int)1e9;
                }
                int rightDiagonal = matrix[i][j];
                if(j+1<col){
                    rightDiagonal = rightDiagonal+dp[i+1][j+1];
                }else{
                    rightDiagonal = rightDiagonal+(int)1e9;
                }
                dp[i][j] = Math.min(down, Math.min(rightDiagonal,leftDiagonal));
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<col;i++){
            min = Math.min(min, dp[0][i]);
        }
        return min;

    }
       int solveMinFallingPathSumM(int i, int j, int[][] matrix, int[][] dp){
        int row = matrix.length;
        int col = matrix[0].length;
        if(i<0 || j<0) return (int)1e9;
        if(i>=row || j>=col) return (int)1e9;
        if(i == row-1){
            return matrix[i][j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        
        int down = matrix[i][j]+ solveMinFallingPathSumM(i+1,j,matrix,dp);
        int leftDiagonal = matrix[i][j]+ solveMinFallingPathSumM(i+1, j-1, matrix,dp);
        int rightDiagonal = matrix[i][j]+solveMinFallingPathSumM(i+1,j+1, matrix,dp);
        return dp[i][j] = Math.min(down,Math.min(leftDiagonal,rightDiagonal));

    }
    // int solveMinFallingPathSum(int i, int j, int[][] matrix){
    //     int row = matrix.length;
    //     int col = matrix[0].length;
    //     if(i<0 || j<0) return (int)1e9;
    //     if(i>=row || j>=col) return (int)1e9;
    //     if(i == row-1){
    //         return matrix[i][j];
    //     }

        
    //     int down = matrix[i][j]+ solveMinFallingPathSum(i+1,j,matrix);
    //     int leftDiagonal = matrix[i][j]+ solveMinFallingPathSum(i+1, j-1, matrix);
    //     int rightDiagonal = matrix[i][j]+solveMinFallingPathSum(i+1,j+1, matrix);
    //     return Math.min(down,Math.min(leftDiagonal,rightDiagonal));

    // }
}