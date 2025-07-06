import java.util.List;
import java.util.*;
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int pcount=0;
        List<Integer> pleft = new ArrayList<>();
        List<Integer> pright = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) {
                pleft.add(nums[i]);
            } else if(nums[i]>pivot) {
                pright.add(nums[i]);
            }else {
                pcount++;
            }
        }

        for(int i=0;i<pleft.size();i++) {
            nums[i] = pleft.get(i);
        }
                    
        int k = pleft.size();
        if(pcount>0){
            while(pcount>0) {
                nums[k] = pivot;
                k++;
                pcount--;
            }
        }

        int right=0;
        for(int i=k;i<k+pright.size();i++) {
            nums[i] = pright.get(right);
            right++;
        }

        return nums;
    }
}