class Solution {
    public void rotate(int[] nums, int k) {
        // for right rotation, we are moving left ele to right
        // B[i]=A[(i-x+n)%n]
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = nums[(i-k%n+n)%n];
        }

        for(int i=0;i<n;i++){
            nums[i]=res[i];
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
