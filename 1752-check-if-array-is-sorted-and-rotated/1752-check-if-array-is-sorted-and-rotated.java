class Solution {
    public boolean check(int[] nums) {
        // base case
        // if(nums == null || nums.length<=2){
        //     return true;
        // }
        // int drop = 0;
        // int n = nums.length;
        // int next = 0;
        // for(int i=0;i<n;i++){
        //     if(i == n-1){
        //         next = nums[0];
        //     }else{
        //         next = nums[i+1];
        //     }
        //     if(nums[i]>next){
        //         drop++;
        //     }
        //     if(drop>1){
        //         return false;
        //     }
        // }
        // return true;
        if(nums == null || nums.length<=2){
            return true;
        }

       int drop=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i-1] > nums[i]){
            drop++;
        }
    }
    if(nums[0]<nums[nums.length-1]){
        drop++;
    }
    // if(drop>1){
    //     return false;
    // }

    // return true;

    return drop<=1; 

    }

}