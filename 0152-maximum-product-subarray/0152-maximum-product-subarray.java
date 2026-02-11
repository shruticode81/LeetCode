class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int leftProd = 1;
        int rightProd = 1;
        int maxProd = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(leftProd == 0) leftProd = 1;
            if(rightProd == 0) rightProd = 1;
            leftProd = leftProd*nums[i];
            rightProd = rightProd*nums[n-i-1];
            maxProd = Math.max(maxProd,Math.max(leftProd,rightProd));

        }
        return maxProd;

    }
}