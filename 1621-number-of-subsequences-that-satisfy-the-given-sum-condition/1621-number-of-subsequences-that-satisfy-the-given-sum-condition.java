import java.util.*;

class Solution {
     public int numSubseq(int[] nums, int target) {
        // sort the array
        int mod = 1_000_000_007;
        Arrays.sort(nums);
        int left=0;
        int right = nums.length-1;
        int res = 0;
        int[] power = new int[nums.length];
        power[0]=1;
        for(int i=1;i<nums.length;i++){
            power[i] = (power[i-1]*2)%mod;
        }
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                res = (res+power[right-left])%mod;
                left++;
            }else{
                right--;
            }
        }
        return res; 
  
    }
    // public int numSubseq(int[] nums, int target) {
    // //     List<Integer> subset = new ArrayList<>();
    // //   int mod = 1_000_000_007;

    // //     return solveSubsequence(nums, target, subset, 0)%mod;
    // }

    // int solveSubsequence(int[] arr, int target, List<Integer> subset, int i) {
    //     if (arr.length == i) {
    //         if (!subset.isEmpty()) {
    //             int min = Collections.min(subset);
    //             int max = Collections.max(subset);
    //             if (min + max <= target) {
    //                 return 1;
    //             }else{
    //                 return 0;
    //             }
    //         }
    //         return 0;
    //     }

    //     subset.add(arr[i]);
    //     int include = solveSubsequence(arr, target, subset, i + 1);
    //     subset.remove(subset.size() - 1);
    //     int exclude = solveSubsequence(arr, target, subset, i + 1);
    //     return include + exclude;
    // }
}