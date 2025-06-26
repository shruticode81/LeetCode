class Solution {
    public void nextPermutation(int[] nums) {
        
        int breakPointIndex = -1;
        int n = nums.length;

        for(int i=n-2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                breakPointIndex=i;
                break;
            }
        }

        if(breakPointIndex == -1) {
            //just reverse 
            reverse(nums, 0, n-1);
            return;
        }

        for (int i=n-1;i>breakPointIndex;i--) {
            if (nums[i]>nums[breakPointIndex]) {
                //swap
                int temp = nums[breakPointIndex];
                nums[breakPointIndex] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        reverse(nums, breakPointIndex+1, n-1);
        return;
    }

    void reverse(int[] nums, int i, int j) {
        while(i<=j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}