class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i] = cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    //    return solveMinCostClimbingStairs(n, cost);
    }
    // int solveMinCostClimbingStairs(int index , int[] cost){
    //     if(index == 0){
    //         return cost[0];
    //     }
    //     if(index==1){
    //         return cost[1];
    //     }

    //     int left = solveMinCostClimbingStairs(index-1,cost);
    //     int right = solveMinCostClimbingStairs(index-2,cost);
    //     return (index == cost.length ? 0 : cost[index] )+ Math.min(left,right);

    // }
}