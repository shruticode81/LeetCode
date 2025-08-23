class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int l=0;
        int r=0;
        int jumps=0;
        int farthest = 0;
        while(r<n-1){
            for(int i=l;i<=r; i++){
                farthest = Math.max(farthest, i+nums[i]);
            }
            l=r+1;
            r=farthest;
            jumps++;

        }
        return jumps;
    }
    // public int jump(int[] nums) {
    //     int n = nums.length;
    //     // return solveJump(0,0,nums);
    //     int dp[][] = new int[n][n];
    //     for(int index =0;index<n;index++){
    //         for(int jumps=0;jumps<n; jumps++){
    //             dp[index][jumps]=-1;
    //         }
    //     }
    //     return solveJumpDP(0,0,dp,n, nums);
    // }

    // int solveJumpDP(int index, int jumps, int dp[][], int n, int nums[]){
    //     // T.c(O(N^2))
    //     // base cond
    //     if(index>=n-1){
    //         return jumps;
    //     }
    //     if(dp[index][jumps]!=-1){
    //         return dp[index][jumps];
    //     }

    //     int mini = Integer.MAX_VALUE;
    //     for(int i=1;i<=nums[index];i++){
    //         mini = Math.min(mini, solveJumpDP(index+i, jumps+1, dp, n, nums));
    //     }
    //     return dp[index][jumps]=mini;
    // }

    // int solveJump(int index, int jumps, int[] nums){
        // Tc = O(n^n)
    //     int n = nums.length;
    //     //base cond
    //     if(index>=n-1) return jumps;
    //     int mini=Integer.MAX_VALUE;
    //     for(int i=1;i<=nums[index];i++){
    //         mini = Math.min(mini,solveJump(index+i,jumps+1,nums));
    //     }
    //     return mini;
    // }
}