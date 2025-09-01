import java.util.*;
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return robM(n-1, dp, nums);
    }
    int robM(int index, int dp[],int nums[]) {
        if(index == 0) return dp[index]= nums[index];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        int pick = nums[index]+robM(index-2, dp,nums);
        int noPick = 0+robM(index-1,dp,nums);
        return dp[index]=Math.max(pick,noPick);
    }
}