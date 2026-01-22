class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2 == 0){
                temp[i]=0;
            }else{
                temp[i] =1;
            }
        }

        // now we have converted given array into binary array
       return numberOfSubarray(temp, k) - numberOfSubarray(temp,k-1);
    }
     int numberOfSubarray(int[] nums, int goal){
        if(goal<0){return 0;}
        int right=0;
        int left=0;
        int sum=0;
        int count=0;
        while(right<nums.length){
            sum=sum+nums[right];
            while(sum>goal){
                sum=sum-nums[left];
                left++;
            }
            count=count+(right-left+1);
            right++;
        }
        return count;
    }
}