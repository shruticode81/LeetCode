class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         int n = nums.length;
        Map<Integer, Integer> h = new HashMap<>();
        long windowSum = 0;
        long maxSum = 0;

        // Initialize first window
        for (int i = 0; i < k; i++) {
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
            windowSum += nums[i];
        }

        if (h.size() == k) {
            maxSum = windowSum;
        }

        // Slide the window
        for (int i = k; i < n; i++) {
            // Remove element going out of window
            int out = nums[i - k];
            h.put(out, h.get(out) - 1);
            if (h.get(out) == 0) h.remove(out);
            windowSum -= out;

            // Add new element
            int in = nums[i];
            h.put(in, h.getOrDefault(in, 0) + 1);
            windowSum += in;

            if (h.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
}}