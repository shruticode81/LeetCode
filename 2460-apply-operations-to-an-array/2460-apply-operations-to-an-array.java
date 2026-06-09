class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        // operation done
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
            }
        }

        // move zeros to the end
        int write = 0;
        for(int read = 0;read<n;read++){
            if(nums[read]!=0){
                nums[write]=nums[read];
                write++;
            }
        }
        for(int i=write;i<n;i++){
            nums[i]=0;
        }

        return nums;
    }
}