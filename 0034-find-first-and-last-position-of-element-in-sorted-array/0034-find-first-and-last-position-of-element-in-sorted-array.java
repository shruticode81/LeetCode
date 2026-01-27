class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int n = nums.length;
         first = lowerbound(nums,target,n);
        if(first == n || nums[first]!=target){
            return new int[] {-1,-1};
        }
       last = upperbound(nums, target, n)-1;
       return new int[]{first,last};
        // for(int i=0;i<n;i++){
        //     if(nums[i] == target){
        //         if(first == -1){
        //             first=i;
        //         }
        //             last=i;
                
        //     }
        // }
        // return new int[]{first,last};
    }
    int lowerbound(int[] nums, int target, int n){
        int ans = n;
        int low=0, high=n-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            } else{
                low= mid+1;
            }
        }
        return ans;
    }
     int upperbound(int[] nums, int target, int n){
        int ans = n;
        int low=0, high=n-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]>target){
                ans = mid;
                high = mid-1;
            } else{
                low= mid+1;
            }
        }
        return ans;
    }
}