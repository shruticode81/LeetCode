class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum=sum+i;
        }
        if(sum%2 != 0) return false;
        else{
            //call subsetSumwithK func 
            int target = sum/2;
            int n = nums.length;
            // return subsetSumWithTarget(n-1, target, nums);
            return subsetSumWithTargetDP(n,target,nums);
        }
    }
    boolean  subsetSumWithTargetDP(int n, int sum, int[] nums){
        boolean dp[][] = new boolean[n+1][sum+1];
        // initization of base cases
        for(int i=0;i<=n;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<=sum;i++){
            dp[0][i]=false;
        }
        for(int i=1;i<=n;i++){
            for(int target=1;target<=sum;target++){
                if(nums[i-1]<=target){
                    dp[i][target]=dp[i-1][target-nums[i-1]]||dp[i-1][target];
                }else{
                    dp[i][target]=dp[i-1][target];
                }
            }
        }
        return dp[n][sum];
    }
    // boolean  subsetSumWithTarget(int index, int target, int[] arr){
    //     // base cond
        
    //     if(target == 0){
    //         return true;
    //     }
    //     if(index<0){
    //         return false;
    //         }
    //     if(index == 0){
    //         return target == arr[index];
    //     }

    //     boolean  notTake =  subsetSumWithTarget(index-1, target, arr);
    //     boolean take = false;
    //     if(arr[index]<=target){
    //         take =  subsetSumWithTarget(index-1, target-arr[index],arr);
    //     }
    //     return notTake || take;
    // }
}