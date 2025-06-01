class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        long windowSum=0;
        long maxSum=0;
        for(int i=0;i<k;i++) {
            if(h.containsKey(nums[i])) {
                Integer value = h.get(nums[i]);
                h.put(nums[i], value+1);
            }else{
                h.put(nums[i], 1);
            }

            windowSum = windowSum+nums[i];

        }

        if (h.size() == k) {
          maxSum=windowSum;
        }

        for(int i=k;i<n;i++) {
            //remove arr[k-i] from sum amd hashmap if freq =0
            if(h.containsKey(nums[i-k])) {
                Integer value = h.get(nums[i-k]);
                h.put(nums[i-k], value-1);
            }
            if(h.get(nums[i-k]) == 0) {
                //remove it from hash map
                h.remove(nums[i-k]);
            }

            windowSum-=nums[i-k];

            if(h.containsKey(nums[i])){
                Integer value = h.get(nums[i]);
                h.put(nums[i], value+1);
            }else{
                h.put(nums[i], 1);
            }

            windowSum+=nums[i];


            if(h.size() == k) {
                maxSum = Math.max(windowSum, maxSum);

            }
        }
        
        return maxSum;
    }
}