class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int n = nums.length;
        int sum = 0;
        int min = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum = sum+nums[i];
            if(sum<=0){
                min = Math.max(sum,min);
                sum = 0;
            }
            max = Math.max(max, sum);
        
        }
        if(max>0){
            return max;
        }
        return min;
    }
}