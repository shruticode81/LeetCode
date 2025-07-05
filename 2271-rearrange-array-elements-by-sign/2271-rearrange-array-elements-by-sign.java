class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length/2;
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        int even = 0;
        int odd = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0) {
                arr1[even] = nums[i];
                even++;
            }else{
                arr2[odd] = nums[i];
                odd++;
            }
        }

        int k=0;
        for (int i=0;i<n;i++) {
            nums[k] = arr1[i];
            k=k+2;
        }
        
        int j=1;
        for(int i=0;i<n;i++) {
            nums[j] = arr2[i];
             j=j+2;
        }
        return nums;
    }
}