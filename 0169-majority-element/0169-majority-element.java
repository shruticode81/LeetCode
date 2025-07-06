import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums.length/2;
        HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
        for(int x: nums) {
         h.put(x, h.getOrDefault(x, 0)+1);
        }
        int res = 0;
        for(Map.Entry<Integer, Integer> map : h.entrySet()){
            if(map.getValue()>majority) {
                res = map.getKey();
            }
        }
        return res;
    }
}