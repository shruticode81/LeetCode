class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int dp [][] = new int[row][row];
        for(int i=0;i<row;i++){
            Arrays.fill(dp[i],-1);
        }
        // return solveMinTotalM(0,0, triangle,dp);
        // return solveMinTotalDP(triangle,dp);
        return solveMinTotalDPSpaceOp(triangle);
    }
    int solveMinTotalDPSpaceOp(List<List<Integer>> triangle){
            //T.C = o(nxn)
            // s.c = o(n) Space optimization
        int row = triangle.size();
        int prev[] = new int[row];
        for(int j=0;j<row;j++){
            prev[j]=triangle.get(row-1).get(j);
        }
        for(int i=row-2;i>=0;i--){
            int temp[] = new int[row];
            for(int j=i;j>=0;j--){
                int down = triangle.get(i).get(j)+prev[j];
                int diagonal = triangle.get(i).get(j)+prev[j+1];
                temp[j] = Math.min(down,diagonal);
            }
            prev = temp;
        }
        return prev[0];
    }
    // int solveMinTotalDP(List<List<Integer>> triangle, int[][] dp){
    //         //T.C = o(nxn)
    //         // s.c = o(nxn)
    //     int row = triangle.size();

    //     for(int j=0;j<row;j++){
    //         dp[row-1][j]=triangle.get(row-1).get(j);
    //     }
    //     for(int i=row-2;i>=0;i--){
    //         for(int j=i;j>=0;j--){
    //             int down = triangle.get(i).get(j)+dp[i+1][j];
    //             int diagonal = triangle.get(i).get(j)+dp[i+1][j+1];
    //             dp[i][j]=Math.min(down, diagonal);
    //         }
    //     }
    //     return dp[0][0];
    // }
    // int solveMinTotalM(int i, int j, List<List<Integer>> triangle, int[][] dp){
    //         //T.C = o(nxn)
    //         // s.c = o(nxn)+o(n)
    //     int row = triangle.size();
    //     // base cond
    //     if(i == row-1){
    //         return triangle.get(i).get(j);
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     int down = triangle.get(i).get(j) + solveMinTotalM(i+1, j, triangle,dp);
    //     int daigonal =  triangle.get(i).get(j) + solveMinTotalM(i+1, j+1, triangle,dp);

    //     return dp[i][j] = Math.min(down, daigonal);

    // }
    // int solveMinTotal(int i, int j, List<List<Integer>> triangle){
        // t.c =o(2^n)
    //     int row = triangle.size();
    //     // base cond
    //     if(i == row-1){
    //         return triangle.get(i).get(j);
    //     }
    //     int down = triangle.get(i).get(j) + solveMinTotal(i+1, j, triangle);
    //     int daigonal =  triangle.get(i).get(j) + solveMinTotal(i+1, j+1, triangle);

    //     return Math.min(down, daigonal);

    // }
}