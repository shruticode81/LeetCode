import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
     int n = nums.length;
     int i=0;
     int j=1;
     while(j<n){
        if (nums[i] == nums[j]) {
            j++;
        }else if(nums[j]>nums[i] && j+1!=n) {
            nums[i+1] = nums[j];
            i++;
            j++;

        } else if (nums[j]>nums[i] && j+1==n) {
            nums[i+1] = nums[j];
            i++;
        }
     }
     return i+1;
    }
}