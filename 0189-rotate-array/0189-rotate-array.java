class Solution {
    public void rotate(int[] nums, int k) {
        // for right rotation, we are moving left ele to right
        // B[i]=A[(i-x+n)%n]
        int n = nums.length;
        k = k%n;
      
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k,n-1);
    }
    void reverse(int[] nums, int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
//   for(int step=0;step<k;step++){
//             rightRotateArray(nums);
//         }
//     }

//     void rightRotateArray(int[] nums) {
//         int n = nums.length;
//         int firstElement = nums[n-1];
//         for(int i=n-2;i>=0;i--){
//             nums[i+1]=nums[i];
//         }
//         nums[0]=firstElement;
//     }

}
