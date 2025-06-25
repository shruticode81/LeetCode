class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1; // assuming there will be consuctive integer
        int i=0;
        int j=1;
        int max=1;
        if(nums.length == 0) {
            return 0;
        }
        // [1,2,3,4,100,200] [1,1,2,3,6,8,9,10,11]
        Arrays.sort(nums);
        
         while (j<nums.length) {
            if (nums[j] - nums[i] == 1) {
                count++;
                max = Math.max(count, max);

            } else if (nums[j]-nums[i] == 0) {
                i++;
                j++;
                continue;
            } 
            else {
                count=1;
            }
            i++;
            j++;
         }

        return max;
    }
}

// for(int k=0;k<nums.length-1;k++) {
//             if(nums[k+1] - nums[k] == 1) {
//                 count++;
//                 max = Math.max(count, max);
//             }else if (nums[k+1] - nums[k] == 0) {
//                 continue;
//             }else{
//                 count=1;
//             }
//         }