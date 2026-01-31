class Solution {
    public boolean check(int[] nums) {
        // base case
        if(nums == null || nums.length<=2){
            return true;
        }

       int drop=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i-1] > nums[i]){
            
            drop++;
            
        }
        if(drop>1){
            return false;
        }
    }
    if(nums[0]<nums[nums.length-1]){
        drop++;
    }
    if(drop>1){
        return false;
    }

    return true;

    }
}