import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int length = nums.length;
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        for(int i=0;i<length;i++) {
            sum=sum+nums[i];

            if (map.containsKey(sum-k)) {
                count = count+map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}