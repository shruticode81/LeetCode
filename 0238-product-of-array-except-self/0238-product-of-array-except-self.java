class Solution {
    public int[] productExceptSelf(int[] nums) {
       
        int[] res = new int[nums.length];
        int prod1 = 1;
        int prod2 =1;
        for(int i=0;i<nums.length;i++){
            // int left=0;
            // int right=nums.length-1;
            // int prod1 = 1;
            // int prod2 =1;
            res[i] = prod1;
            prod1 = prod1*nums[i];

            // while(left<i){
            //     prod1 = nums[left]*prod1;
            //     left++;
            // }
            // res[i]=prod1*prod2;

            // while(right>i){
            //     prod2 = nums[right]*prod2;
            //     right--;
            // }
        }

        for(int j=nums.length-1;j>=0;j--){
            res[j]=res[j]*prod2;
            prod2 = prod2*nums[j];
        }

        return res;
    }
}
// [1,2,3,4]
// left=0
// right=3
// res = [1,1,2,6]


